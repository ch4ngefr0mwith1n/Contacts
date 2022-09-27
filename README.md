```
Start test 1
[menu] Enter action (add, list, search, count, exit): > exit

Start test 2
[menu] Enter action (add, list, search, count, exit): > count
The Phone Book has 0 records.
[menu] Enter action (add, list, search, count, exit): > exit

Start test 3
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > person
Enter the name: > John
Enter the surname: > Smith
Enter the birth date: (YYYY-MM-DD) > 
Bad birth date!
Enter the gender (M, F): > 
Bad gender!
Enter the number: > 123 456 789
The record added.

[menu] Enter action (add, list, search, count, exit): > count
The Phone Book has 1 records.
[menu] Enter action (add, list, search, count, exit): > exit

Start test 4
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > person
Enter the name: > John
Enter the surname: > Smith
Enter the birth date: (YYYY-MM-DD) > 
Bad birth date!
Enter the gender (M, F): > 
Bad gender!
Enter the number: > 123 456 789
The record added.

[menu] Enter action (add, list, search, count, exit): > list
1. John Smith

[list] Enter action ([number], back): > 1
Name: John
Surname: Smith
Birth date: [no data]
Gender: [no data]
Number: 123 456 789
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit

Start test 5
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > Pizza Shop
Enter the address: > Wall St. 1
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > list
0. Pizza Shop

[list] Enter action ([number], back): > 1
Organization name: Pizza Shop
Address: Wall St. 1
Number: +0 (123) 456-789-9999
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit

Start test 6
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > person
Enter the name: > John
Enter the surname: > Smith
Enter the birth date: (YYYY-MM-DD) > 
Bad birth date!
Enter the gender (M, F): > 
Bad gender!
Enter the number: > 123 456 789
The record added.

[menu] Enter action (add, list, search, count, exit): > list
1. John Smith

[list] Enter action ([number], back): > 1
Name: John
Surname: Smith
Birth date: [no data]
Gender: [no data]
Number: 123 456 789
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > edit
Select a field (name, surname, birth, gender, number): > gender
Enter the gender (M, F): > M
Saved
Name: John
Surname: Smith
Birth date: [no data]
Gender: M
Number: 123 456 789
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > list
1. John Smith

[list] Enter action ([number], back): > 1
Name: John
Surname: Smith
Birth date: [no data]
Gender: M
Number: 123 456 789
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit

Start test 7
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > Pizza Shop
Enter the address: > Wall St. 1
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > list
0. Pizza Shop

[list] Enter action ([number], back): > 1
Organization name: Pizza Shop
Address: Wall St. 1
Number: +0 (123) 456-789-9999
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > edit
Select a field (organization name, address, number): > address
Enter the address: > Wall St 2
Saved
Organization name: Pizza Shop
Address: Wall St 2
Number: +0 (123) 456-789-9999
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > list
0. Pizza Shop

[list] Enter action ([number], back): > 1
Organization name: Pizza Shop
Address: Wall St 2
Number: +0 (123) 456-789-9999
Time created: 2022-09-15T16:16
Time last edit: 2022-09-15T16:16

[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit

Start test 8
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > Pizza Shop
Enter the address: > Wall St. 1
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > person
Enter the name: > John
Enter the surname: > Smith
Enter the birth date: (YYYY-MM-DD) > 
Bad birth date!
Enter the gender (M, F): > 
Bad gender!
Enter the number: > 123 456 789
The record added.

[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > PizzaNuts
Enter the address: > Wall St. 6
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > search
Enter search query: > pizz
Found 2 results:
1. Pizza Shop
2. PizzaNuts

[search] Enter action ([number], back, again):> 1
[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit

Start test 9
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > Pizza Shop
Enter the address: > Wall St. 1
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > person
Enter the name: > John
Enter the surname: > Smith
Enter the birth date: (YYYY-MM-DD) > 
Bad birth date!
Enter the gender (M, F): > 
Bad gender!
Enter the number: > 123 456 789
The record added.

[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > PizzaNuts
Enter the address: > Wall St. 6
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > search
Enter search query: > s
Found 3 results:
1. Pizza Shop
2. John Smith
3. PizzaNuts

[search] Enter action ([number], back, again):> 1
[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit

Start test 10
[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > Pizza Shop
Enter the address: > Wall St. 1
Enter the number: > +0 (123) 456-789-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > person
Enter the name: > John
Enter the surname: > Smith
Enter the birth date: (YYYY-MM-DD) > 
Bad birth date!
Enter the gender (M, F): > 
Bad gender!
Enter the number: > 123 456 789
The record added.

[menu] Enter action (add, list, search, count, exit): > add
Enter the type (person, organization): > organization
Enter the organization name: > PizzaNuts
Enter the address: > Wall St. 6
Enter the number: > +0 (123) 456-781-9999
The record added.

[menu] Enter action (add, list, search, count, exit): > search
Enter search query: > 789
Found 2 results:
1. Pizza Shop
2. John Smith

[search] Enter action ([number], back, again):> 1
[record] Enter action (edit, delete, menu): > menu
[menu] Enter action (add, list, search, count, exit): > exit
```
