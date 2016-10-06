
select d.department_id, d.department_name, e.employee_id, e.first_name
from departments d,employees e
where d.department_id=e.department_id
order by d.department_id

select * from employees where
		employee_id in(100,200,202)
		
		
		
		
		
select * from mem;
		
insert into mem values(mem_num_seq.nextval, '홍길동3',21,'서울');
insert into mem values(mem_num_seq.nextval, '홍길동4',22,'서울1');
insert into mem values(mem_num_seq.nextval, '홍길동5',23,'서울12');
insert into mem values(mem_num_seq.nextval, '홍길동6',24,'서울2');
insert into mem values(mem_num_seq.nextval, '홍길동7',25,'서울3');

		
		
select e.employee_id, e.first_name, d.department_name, l.street_address
from employees e, departments d, locations l
where e.department_id = d.department_id
and d.location_id = l.location_id
		
		
select l.city, d.department_name, e.first_name, e.salary
from locations l, departments d, employees e
where l.location_id = d.location_id
and d.department_id = e.department_id
order by l.city
		
		
		