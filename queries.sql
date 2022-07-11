-- Part 1: Test it with SQL
--columns are id, employer, name, and skills
--id is an int, the rest are varchar

-- Part 2: Test it with SQL
SELECT name
FROM employer
where location = "St. Louis City";

-- Part 3: Test it with SQL

--DROP table job;

-- Part 4: Test it with SQL
--
SELECT FROM skill
(LEFT|INNER) JOIN job_skills ON (skill.id = job_skills.skills_id|job_skills.skills_id = skill.id)
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;