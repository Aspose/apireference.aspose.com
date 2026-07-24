---
title: "System::Data::Common::DbDataReader clase"
linktitle: "DbDataReader"
second_title: "Aspose.Page para C++"
description: "Clase System::Data::Common::DbDataReader. API para recibir datos de la base de datos. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 400
url: /es/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API para recibir datos de la base de datos. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class DbDataReader : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Close](./close/)() | Cierra el canal de recuperación de datos. |
| virtual [idx_get](./idx_get/)(String) | Obtiene el elemento con nombre. |
| virtual [idx_get](./idx_get/)(int) | Obtiene el elemento por índice. |
| virtual [Read](./read/)() | Lee el siguiente registro de la base de datos. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Información RTTI. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
