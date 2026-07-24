---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Page para C++"
description: "System::IO::MemoryStream class. Representa un flujo que lee y escribe en memoria. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1800
url: /es/cpp/system.io/memorystream/
---
## MemoryStream class


Representa un flujo que lee y escribe en memoria. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class MemoryStream : public System::IO::Stream
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Close](./close/)() override | Cierra el flujo. |
| [Flush](./flush/)() override | No hace nada. |
| [get_CanRead](./get_canread/)() const override | Determina si el flujo es legible. |
| [get_CanSeek](./get_canseek/)() const override | Determina si el flujo admite búsqueda. |
| [get_CanWrite](./get_canwrite/)() const override | Determina si el flujo es escribible. |
| [get_Capacity](./get_capacity/)() | Devuelve la capacidad actual del búfer de memoria subyacente. |
| [get_Length](./get_length/)() const override | Devuelve la longitud del flujo en bytes. |
| [get_Position](./get_position/)() const override | Devuelve la posición actual del flujo. |
| virtual [GetBuffer](./getbuffer/)() | Devuelve un puntero al búfer subyacente. |
| [MemoryStream](./memorystream/)() | Construye una nueva instancia de la clase [MemoryStream](./) con una capacidad inicial igual a 0. |
| [MemoryStream](./memorystream/)(int) | Construye una nueva instancia de la clase [MemoryStream](./) que representa un flujo basado en un búfer de memoria del tamaño especificado. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Construye una nueva instancia de la clase [MemoryStream](./) que representa un flujo de memoria conectado al búfer de memoria especificado. Un parámetro indica si el flujo es escribible. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Construye una nueva instancia de la clase [MemoryStream](./) que representa un flujo de memoria conectado a un segmento del búfer de memoria especificado que comienza en el índice especificado e incluye el número especificado de elementos. Los parámetros indican si el flujo es escribible y si se puede llamar al método GetBytes(). |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Lee la cantidad especificada de bytes del flujo y los escribe en la matriz de bytes especificada. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Lee la cantidad especificada de bytes del flujo y los escribe en la matriz de bytes especificada. |
| [ReadByte](./readbyte/)() override | Lee un solo byte del flujo y devuelve un valor entero de 32 bits equivalente al valor del byte leído. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Establece la posición del flujo representado por el objeto actual. |
| [set_Capacity](./set_capacity/)(int) | Establece la capacidad del búfer de memoria subyacente. |
| [set_Position](./set_position/)(int64_t) override | Establece la posición del flujo. |
| [SetLength](./setlength/)(int64_t) override | Establece la longitud del flujo representado por el objeto actual. |
| virtual [ToArray](./toarray/)() | Devuelve una copia del búfer de memoria subyacente como una matriz de bytes. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Devuelve la matriz de bytes sin signo con la que se creó este flujo. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Escribe el subrango especificado de bytes de la matriz de bytes especificada al flujo. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Escribe el subrango especificado de bytes de la matriz de bytes especificada al flujo. |
| [WriteByte](./writebyte/)(uint8_t) override | Escribe el valor entero sin signo de 8 bits especificado al flujo. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Escribe el contenido del búfer subyacente al flujo especificado. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [Null](../stream/null/) | Un flujo sin almacenamiento subyacente. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a sí mismo. |
## Ver también

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
