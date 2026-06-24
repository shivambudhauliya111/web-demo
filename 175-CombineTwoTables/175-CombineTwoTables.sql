-- Last updated: 24/06/2026, 14:29:24
# Write your MySQL query statement below
SELECT
p.firstName,
p.lastName,
a.city,
a.state
FROM Person p
LEFT JOIN Address a
ON p.personId=a.personId;

