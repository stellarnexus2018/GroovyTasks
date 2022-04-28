// Creating a Set
def Set1 = [1,2,1,4,5,9] as Set
Set Set2 = new HashSet( ['a','b','c','d'] )
Set Set3 = [100,200,100,400,500] as Set
Set set4 = new HashSet()

set4.add(123)
set4.add(456)
set4.add(789)


println 'Set1 ' + Set1
println 'Set2 ' + Set2
println 'Set3 ' + Set3
println 'set4 ' + set4

// Modifying a Set
Set2.add(1)
println 'Set2_0 ' + Set2
Set2.add(9)
println 'Set2_1 ' + Set2
Set2.addAll([4,5]) // Set2: [1, d, 4, b, 5, c, a, 9]
println 'Set2_2 ' + Set2
Set2.remove(1)
println 'Set2_3 ' + Set2
Set2.removeAll([4,5]) // Set2: [d, b, c, a, 9]
println 'Set2_4 ' + Set2
// Union of Set
Set Union = Set1 + Set2 // Union: [1, 2, 4, 5, 9, d, b, c, a]
// Intersection of Set
Set Inters = Set1.intersect(Set2) // Intersection: [9]
// Complement of Set
Set Complement = Union.minus(Set1) // Complement: [d, b, c, a]

println 'Union ' + Union
println 'Inters ' + Inters
println 'Complement ' + Complement

List l1 = new ArrayList()
l1.add(1)
l1.add(1)
println 'l1 ' + l1
