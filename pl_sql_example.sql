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


declare
a number := 10;
b number := 20;
begin
if a > b then
dbms_output.put_line('a is greater than b');
else
dbms_output.put_line('b is greater than a');
end if;
end;
/
