---
title: "System::SmartPtrInfo clase"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page para C++"
description: "System::SmartPtrInfo clase. Clase de servicio para probar y modificar el contenido de SmartPtr''s sin conocer el tipo final. Utilizada para recolección de basura y detección de referencias cíclicas, etc. Piense en ella como un ''puntero a puntero''. No podemos usar el tipo base de SmartPtr''s ya que no tiene ninguno; en su lugar, usamos esta clase ''info'' en C++."
type: docs
weight: 5600
url: /es/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Clase de servicio para probar y modificar el contenido de [SmartPtr](../smartptr/)'s sin conocer el tipo final. Utilizada para recolección de basura y detección de referencias cíclicas, etc. Piense en ella como un 'puntero a puntero'. No podemos usar el tipo base de [SmartPtr](../smartptr/)'s ya que no tiene ninguno; en su lugar, usamos esta clase 'info'.

```cpp
class SmartPtrInfo
```

## Métodos

| Método | Descripción |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Obtiene el objeto crudo al que apunta el puntero referenciado. |
| [getObject](./getobject/)() const | Obtiene el objeto al que apunta el puntero referenciado. |
| [getOwned](./getowned/)() const | Obtiene el puntero que posee el objeto. |
| [operator bool](./operatorbool/)() const | Comprueba si el objeto info apunta a un puntero no nulo. |
| [operator!](./operator!/)() const | Comprueba si el objeto info no apunta a un puntero no nulo. |
| [operator->](./operator-_/)() const | Permite llamar a los métodos de [Object](../object/) apuntado por el puntero referenciado. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Less-compara valores de punteros referenciados por dos objetos de información. |
| [SmartPtrInfo](./smartptrinfo/)() | Crea un objeto [SmartPtrInfo](./) vacío. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Crea un objeto [SmartPtrInfo](./) con información sobre un puntero inteligente específico. |
## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
