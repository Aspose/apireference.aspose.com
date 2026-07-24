---
title: "System::Net::Http::ByteArrayContent class"
linktitle: "ByteArrayContent"
second_title: "Aspose.Page para C++"
description: "System::Net::Http::ByteArrayContent class. Representa contenido HTTP como una matriz de bytes. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 100
url: /es/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Representa contenido HTTP como una matriz de bytes. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Métodos

| Método | Descripción |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | Información RTTI. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Construye una nueva instancia. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Intenta calcular la longitud de la matriz de bytes. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | La codificación predeterminada. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | El número máximo de bytes. |
## Ver también

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
