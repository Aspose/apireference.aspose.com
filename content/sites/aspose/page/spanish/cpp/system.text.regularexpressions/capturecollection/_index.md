---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::RegularExpressions::CaptureCollection. Lista de capturas realizadas por un único grupo de captura. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 200
url: /es/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Lista de capturas realizadas por un único grupo de captura. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Desactiva la modificación de la colección. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Método de servicio para agregar una captura a la colección. |
| [Clear](./clear/)() override | Desactiva la limpieza de la colección. |
| [get_Count](./get_count/)() const override | Obtiene el número de capturas. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Marca la colección como solo lectura. |
| [get_IsSynchronized](./get_issynchronized/)() const | Marca la colección como no sincronizada. |
| [idx_get](./idx_get/)(int) const override | Accesor [Capture](../capture/). |
| [operator[]](./operator[]/)(int) | Accesor [Capture](../capture/). |
| [operator[]](./operator[]/)(int) const | Accesor [Capture](../capture/). |
| [Remove](./remove/)(const CapturePtr\&) override | Desactiva la modificación de la colección. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Base](./base/) | Tipo [Base](./base/). |
## Ver también

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
