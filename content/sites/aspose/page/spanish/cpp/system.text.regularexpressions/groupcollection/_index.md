---
title: "System::Text::RegularExpressions::GroupCollection clase"
linktitle: "GroupCollection"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::RegularExpressions::GroupCollection. Lista de grupos de captura en una sola coincidencia. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 400
url: /es/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Lista de grupos de captura en una sola coincidencia. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Desactiva la adición de elementos a la colección. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Agrega un grupo a la colección. |
| [Clear](./clear/)() override | Desactiva la eliminación de elementos de la colección. |
| [get_Item](./get_item/)(int) const | Accesor [Group](../group/). |
| [get_Item](./get_item/)(const String\&) const | Accesor [Group](../group/). |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Constructor. |
| virtual [idx_get](./idx_get/)(String) const | Accesor [Group](../group/). |
| [idx_get](./idx_get/)(int) const override | Accesor [Group](../group/). |
| [IsReadOnly](./isreadonly/)() const | Marca la colección como solo lectura. |
| [operator[]](./operator[]/)(const String\&) const | Accesor [Group](../group/). |
| [operator[]](./operator[]/)(int) | Accesor [Group](../group/). |
| [operator[]](./operator[]/)(int) const | Accesor [Group](../group/). |
| [Remove](./remove/)(const GroupPtr\&) override | Desactiva la eliminación de un elemento de la colección. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Base](./base/) | Clase [Base](./base/). |
## Ver también

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
