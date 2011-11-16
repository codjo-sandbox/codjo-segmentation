package net.codjo.segmentation.gui;
import net.codjo.test.common.depend.Dependency;
import net.codjo.test.common.depend.PackageDependencyTestCase;

public class DependencyTest extends PackageDependencyTestCase {

    public void test_dependency() throws Exception {
        Dependency dependency = createDependency();
        dependency.addIgnoredPackage("com.jgoodies");
        dependency.addIgnoredPackage("com.intellij");
        dependency.assertDependency("dependency.txt");
        dependency.assertNoCycle();
    }


    public void test_dependencyTest() throws Exception {
        Dependency dependency = createTestDependency();
        dependency.addIgnoredPackage("com.jgoodies");
        dependency.addIgnoredPackage("com.intellij");
        dependency.assertDependency("dependencyTest.txt");
        dependency.assertNoCycle();
    }
}
