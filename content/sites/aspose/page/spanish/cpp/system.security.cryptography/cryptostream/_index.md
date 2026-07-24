---
title: "Clase System::Security::Cryptography::CryptoStream"
linktitle: "CryptoStream"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Cryptography::CryptoStream. Implementación de flujo que envuelve un flujo existente con una función criptográfica. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 500
url: /es/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Implementación de flujo que envuelve un flujo existente con una función criptográfica. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class CryptoStream : public System::IO::Stream
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Close](./close/)() override | Cierra la conexión. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Constructor. |
| [Flush](./flush/)() override | Vacía el búfer en el flujo envuelto. No hace nada ya que el algoritmo de transformación puede seguir esperando más datos. |
| [FlushFinalBlock](./flushfinalblock/)() | Escribe los datos que aún están en el búfer al flujo. |
| [get_CanRead](./get_canread/)() const override | Comprueba si el flujo es legible. |
| [get_CanSeek](./get_canseek/)() const override | Comprueba si el flujo permite buscar. |
| [get_CanWrite](./get_canwrite/)() const override | Comprueba si el flujo es escribible. |
| [get_Length](./get_length/)() const override | Obtiene la longitud del flujo. No soportado. |
| [get_Position](./get_position/)() const override | Obtiene la posición actual en el flujo. No soportado. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lee datos del flujo. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lee datos del flujo. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Busca la posición en el flujo. No soportado. |
| [set_Position](./set_position/)(int64_t) override | Busca la posición en el flujo. No soportado. |
| [SetLength](./setlength/)(int64_t) override | Busca el tamaño del flujo. No soportado. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Escribe datos al flujo. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Escribe datos al flujo. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flujo sin almacenamiento subyacente. |
## Ver también

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
