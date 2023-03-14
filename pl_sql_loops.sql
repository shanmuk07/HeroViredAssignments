declare
i number;
begin
i := 1;
loop
dbms_output.put_line('i is : '||i);
i := i+1;
exit when i > 10;
end loop;
end;
/
