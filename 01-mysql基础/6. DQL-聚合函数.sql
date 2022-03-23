#聚合函数:将一列数据作为一个整体，进行纵向计算

#1.统计班级一共有多少个学生
select * frome stu;
select count(id) from stu;
select count(*) from stu;
#2.search the highest math Score
select max(math) from stu;

#3.search math sum score
select sum(math) from stu;


#4.查询数学成绩的平均分
select avg(math) from stu;

-- lowest english Score
-- null值不参与聚合函数
select min(english) from stu;