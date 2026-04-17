#  Semana08 - Excepciones e Hilos

##  Descripción
En este proyecto se simula una cuenta bancaria donde varios cajeros (hilos) intentan retirar dinero al mismo tiempo.  
Se aplican conceptos de hilos, sincronización y manejo de excepciones en Java.

---

##  ¿Qué se implementó?

- Clase CuentaBancaria con saldo
- Métodos depositar y retirar usando synchronized
- Excepción personalizada SaldoInsuficienteException
- Clase Cajero usando Runnable
- Ejecución de 3 hilos simultáneos

---

##  Manejo de excepciones

Se creó una excepción personalizada para evitar que se retire más dinero del disponible.  
Esto permite controlar errores sin que el programa falle y mostrar mensajes claros.

---

##  Uso de hilos

Cada cajero se ejecuta como un hilo independiente, simulando varios usuarios accediendo al mismo tiempo a la cuenta.

---

##  Sincronización

Se utilizó synchronized en el método retirar() para evitar que varios hilos modifiquen el saldo al mismo tiempo.

---

##  Resultado esperado

- Un cajero logra retirar correctamente  
- Los otros muestran error por saldo insuficiente  
- El saldo final se mantiene correcto  

---

## 🖼️ Evidencia

### Ejecución del programa
![Consola](img/ejecucion.png)

### Código en IntelliJ
![Código](img/codigo.png)

---

## 🚨 ¿Qué pasa sin synchronized?

Sin synchronized, varios hilos pueden acceder al saldo al mismo tiempo, lo que puede generar errores como saldo negativo o resultados incorrectos.

---

## ✅ Conclusión

La sincronización evita problemas cuando varios hilos usan el mismo recurso.  
El uso de excepciones permite manejar errores de forma controlada y segura.

---

## 🧑‍💻 Autor

- Tu nombre
- Nombre de tu compañero
