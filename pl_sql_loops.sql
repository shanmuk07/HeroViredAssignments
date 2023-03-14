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


declare
i number;
begin
i := 1;
while i <= 10
loop
dbms_output.put_line('i is '||i);
i := i+1;
end loop;
end;
/


declare
i number;
n number;
fact number;
begin
i := 1;
fact := 1;
n := &n;
for i IN 1..n
loop
fact := fact * i;
end loop;
dbms_output.put_line(fact);
end;
 15  /
