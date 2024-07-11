# LatinExchange - Conversor de Divisas

LatinExchange es una aplicación de consola en Java que permite convertir entre varias monedas latinoamericanas y principales monedas como el dólar estadounidense (USD) y el euro (EUR). La aplicación utiliza la API de ExchangeRate para obtener las tasas de cambio en tiempo real y proporciona un historial de conversiones para el usuario.

## Funcionalidades

- Conversión de Dólar estadounidense (USD) a:
  - Peso argentino (ARS)
  - Boliviano (BOB)
  - Real brasileño (BRL)
  - Peso chileno (CLP)
  - Peso colombiano (COP)
- Conversión de Euro (EUR) a:
  - Peso argentino (ARS)
  - Boliviano (BOB)
  - Real brasileño (BRL)
  - Peso chileno (CLP)
  - Peso colombiano (COP)
- Muestra el historial de conversiones con detalles de la fecha y la hora.

## Requisitos

- Java JDK 11 o superior
- Biblioteca Gson 2.10.1 o superior

## Instalación

1. Clona el repositorio:
   ```sh
   git clone https://github.com/tu_usuario/latinexchange.git
   cd latinexchang
  Uso
Al ejecutar la aplicación, verás un menú en la consola donde podrás seleccionar la conversión deseada o ver el historial de conversiones:

plaintext
Copiar código
-------------------------------------------------
Bienvenido al conversor de divisa LatinExchange
--- Porfavor seleccione una opción del menú ---
-------------------------------------------------

1 - Dollar a Peso Argentino
2 - Dollar a Boliviano
3 - Dollar a Real Brasileño
4 - Dollar a Peso Chileno
5 - Dollar a Peso Colombiano
6 - Euro a Peso Argentino
7 - Euro a Boliviano
8 - Euro a Real Brasileño
9 - Euro a Peso Chileno
10 - Euro a Peso Colombiano
11 - Mostrar el historial de conversiones
12 - Salir
-------------------------------------------------
Ingrese la opción:
Selecciona una opción ingresando el número correspondiente y presiona Enter. El programa realizará la conversión y mostrará el resultado en la consola. Para ver el historial de conversiones, selecciona la opción 11.

Contribuciones
¡Las contribuciones son bienvenidas! Si encuentras un problema o tienes una mejora, abre un issue o envía un pull request.

Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para obtener más detalles.

Agradecimientos
ExchangeRate API por proporcionar las tasas de cambio en tiempo real.
Gson por la biblioteca de manejo de JSON.
