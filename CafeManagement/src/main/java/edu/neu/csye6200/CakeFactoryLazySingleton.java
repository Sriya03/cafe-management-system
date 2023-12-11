/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author kaush
 */
public class CakeFactoryLazySingleton implements CafeItemFactoryAPI {
    private static CakeFactoryLazySingleton instance;

    private CakeFactoryLazySingleton() {}

    public static CakeFactoryLazySingleton getInstance() {
        if (instance == null) {
            instance = new CakeFactoryLazySingleton();
        }
        return instance;
    }

    @Override
    public CafeItem createCafeItemInstance(String name, int price) {
        return new CakeItem(name, price);
    }
}