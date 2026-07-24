---
title: "Clase System::Data::Common::DbCommand"
linktitle: "DbCommand"
second_title: "Aspose.Page para C++"
description: "Clase System::Data::Common::DbCommand. Comando de base de datos. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 100
url: /es/cpp/system.data.common/dbcommand/
---
## DbCommand class


Comando de base de datos. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DbCommand : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Ejecuta un comando que no es una consulta. |
| virtual [ExecuteReader](./executereader/)() | Ejecuta un comando de consulta. |
| virtual [get_CommandText](./get_commandtext/)() const | Información RTTI. |
| virtual [get_Connection](./get_connection/)() const | Obtiene la conexión a la base de datos asociada al comando. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Establece el texto del comando DB. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Obtiene la conexión a la base de datos asociada al comando. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
