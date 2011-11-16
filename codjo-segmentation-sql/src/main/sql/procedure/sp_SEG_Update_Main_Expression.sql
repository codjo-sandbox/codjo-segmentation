if exists (select 1 from sysobjects where id = object_id('sp_SEG_Update_Main_Expression') and type = 'P')
begin
   drop proc sp_SEG_Update_Main_Expression
   print 'Procedure sp_SEG_Update_Main_Expression supprimee'
end
go

/********************************************************************************/
/* Proc�dure permettant de mettre � jour l'expression globale d'un axe donn�	*/
/********************************************************************************/

create proc sp_SEG_Update_Main_Expression (@CLASSIFICATION_ID int, @EXPRESSION varchar(15000)) as
begin

	update PM_EXPRESSION
		set EXPRESSION = @EXPRESSION
	from PM_EXPRESSION
	where SEGMENTATION_ID = @CLASSIFICATION_ID
		and DESTINATION_FIELD = 'SLEEVE_CODE'

end
go

if exists (select 1 from sysobjects where id = object_id('sp_SEG_Update_Main_Expression') and type = 'P')
   print 'Procedure sp_SEG_Update_Main_Expression cree'
go

exec sp_procxmode 'sp_SEG_Update_Main_Expression','anymode'
print 'Procedure sp_SEG_Update_Main_Expression : transaction mode pass�e en anymode'
go