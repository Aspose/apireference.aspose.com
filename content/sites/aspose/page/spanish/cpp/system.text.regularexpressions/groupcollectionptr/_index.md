---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::RegularExpressions::GroupCollectionPtr. Puntero a colección de grupos. Este tipo es un puntero para gestionar la eliminación de otros objetos. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante en C++."
type: docs
weight: 500
url: /es/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Constructor de puntero nulo. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Constructor de conversión de tipo. |
| [operator[]](./operator[]/)(size_t) const | Accesor [Group](../group/). |
## Ver también

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
