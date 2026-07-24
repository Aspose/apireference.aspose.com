---
title: "Clase System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Page para C++"
description: "Clase System::Data::IDataRecord. Interfaz para registro con columnas. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1300
url: /es/cpp/system.data/idatarecord/
---
## IDataRecord class


Interfaz para registro con columnas. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IDataRecord : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | Información RTTI. |
| virtual [GetName](./getname/)(const int32_t) | Obtiene el nombre del campo en la posición especificada. |
| virtual [idx_get](./idx_get/)(const int32_t) | Obtiene el valor en el índice especificado. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
