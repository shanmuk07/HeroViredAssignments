 set serveroutput on verify off
 declare
 a number;
 b number;
 begin
 a:=10;
 b:=10;
 dbms_output.put_line('the value of a = '||a);
 dbms_output.put_line('the value of b = '||b);
 end;
 /






declare
a number;
b number;
c number;
begin
a := 10;
b := 20;
c := a+b;
dbms_output.put_line('Sum of a an b : ' ||c);
end;
/
