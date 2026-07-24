---
title: "Espacio de nombres System::Collections"
linktitle: "System::Collections"
second_title: "Aspose.Page para C++"
description: "Cómo usar el espacio de nombres System::Collections en C++."
type: docs
weight: 2200
url: /es/cpp/system.collections/
---



## Clases

| Clase | Descripción |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) de bits que pueden ser accedidos por índice. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [BitArrayPtr](./bitarrayptr/) | Puntero a [BitArray](./bitarray/). Este tipo es un puntero para gestionar la eliminación de otro objeto. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante. |
| [CollectionBase](./collectionbase/) | Proporciona una clase base abstracta para una colección fuertemente tipada. |
| [ICollection](./icollection/) | Define la interfaz de colección no genérica. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) es la interfaz base para todas las colecciones no genéricas que pueden enumerarse. |
| [IEnumerator](./ienumerator/) | Interfaz de enumerador que puede usarse para iterar a través de algunos elementos. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | Envoltorio que crea una implementación no genérica de [IEnumerator](./ienumerator/) sobre el iterador genérico [IEnumeratorImplRefType](./ienumeratorimplreftype/) - envoltorio para los tipos de referencia. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | Envoltorio que crea una implementación no genérica de [IEnumerator](./ienumerator/) sobre el iterador genérico [IEnumeratorImplRefType](./ienumeratorimplreftype/) - envoltorio para los tipos de valor. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) Representa una colección no genérica de objetos que pueden accederse individualmente por índice. |
| [IListImplRefType](./ilistimplreftype/) | Stub que implementa la interfaz [System::Collections::IList](./ilist/) sobre un objeto [System::Collections::Generic::List](../system.collections.generic/list/) Implementación para tipos de referencia. |
| [IListImplValueType](./ilistimplvaluetype/) | Stub que implementa la interfaz [System::Collections::IList](./ilist/) sobre un objeto [System::Collections::Generic::List](../system.collections.generic/list/) Implementación para tipos de valor. |
| [IListWrapper](./ilistwrapper/) | Interfaz para soportar la conversión de genérica a no genérica. |
| [Invalidatable](./invalidatable/) | Clase que permite rastrear el estado de sus descendientes a través de objetos [InvalidatableTracker](./invalidatabletracker/). |
| [InvalidatableTracker](./invalidatabletracker/) | Clase que implementa rastreadores de objetos [Invalidatable](./invalidatable/). |
