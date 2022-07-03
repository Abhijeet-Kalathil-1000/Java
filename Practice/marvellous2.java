//1 : One class can extend another class
class Base
{}

class Derived extends Base
{}
////////////////////////////////////////////////////////////////
//2 : One class can implement one interface

interface Demo
{}

class Hello implements Demo
{}

////////////////////////////////////////////////////////////////
//3 : One class can implement more than once interface

interface Hello
{}
interface Demo
{}

class Marvellous implements Hello,Demo
{}

////////////////////////////////////////////////////////////////
//4 : Once interface can extend another interface

interface Demo
{}

interface Hello extends Demo
{}

class Marvellous implements Hello
{}

////////////////////////////////////////////////////////////////
// 5 : One class can extend and implement one interface

class Demo 
{}

interface Hello
{}

class Marvellous extends Demo implements Hello
{}
////////////////////////////////////////////////////////////////
