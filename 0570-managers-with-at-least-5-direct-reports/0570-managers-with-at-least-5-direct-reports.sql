# Write your MySQL query statement below
select e.name from employee e join employee m on m.managerid=e.id group by m.managerid having count(*)>=5;