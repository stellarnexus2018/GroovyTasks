class Order {
    int orderNo
    Customer orderedByCustomer
    String description
    

    static main(args) {
        Order order1 = new Order()
        order1.orderNo = 1
        order1.orderedByCustomer = new Customer(name: 'Customer1', email: 'cust1@example.com', address: 'СССР')
        order1.setDescription('Ordered by Customer1')
        println order1.orderedByCustomer.showMail()
        println order1.orderedByCustomer.showAddr()
    }
}

class Customer{
    String name
    String email
    String address
    String showMail() {
        email
    }
    String showAddr() {
        address
    }
}