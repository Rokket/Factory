package com.bsuir.matveyenka.presentation.form;

import com.bsuir.matveyenka.entity.*;
import org.apache.struts.action.ActionForm;

import java.util.List;

/**
 * User: User
 * Date: 15/12/12
 */
public class MainForm extends ActionForm {

    private List<Order> orders;

    private List<Profit> profits;

    private List<Product> products;

    private List<Client> clients;

    private List<Equipment> equipments;

    private List<Factory> factories;

    private List<Personnel> personnel;

    private Order order = new Order();

    private Profit profit = new Profit();

    private Product product = new Product();

    private Client client = new Client();

    private Equipment equipment = new Equipment();

    private Factory factory = new Factory();

    private Personnel person = new Personnel();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Profit> getProfits() {
        return profits;
    }

    public void setProfits(List<Profit> profits) {
        this.profits = profits;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Profit getProfit() {
        return profit;
    }

    public void setProfit(Profit profit) {
        this.profit = profit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Personnel getPerson() {
        return person;
    }

    public void setPerson(Personnel person) {
        this.person = person;
    }
}
