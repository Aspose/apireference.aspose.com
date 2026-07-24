---
title: "Clase System::Collections::ObjectModel::KeyedCollection"
linktitle: "KeyedCollection"
second_title: "Aspose.Page para C++"
description: "Clase System::Collections::ObjectModel::KeyedCollection. Colección abstracta de elementos con claves incrustadas. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 200
url: /es/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Colección abstracta de elementos con claves incrustadas. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parámetro | Descripción |
| --- | --- |
| TKey | Tipo de clave. |
| TItem | tipo de valor. |
## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Agregar elemento al final del contenedor. |
| [Contains](./contains/)(TKey) | Comprueba si la clave está presente en el contenedor. |
| [get_Comparer](./get_comparer/)() | Obtiene el comparador. |
| [idx_get](./idx_get/)(TKey) | Obtiene el elemento en un índice específico. |
| [Remove](./remove/)(TKey) | Elimina la clave del contenedor. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Hace que un argumento de plantilla específico se trate como puntero débil en lugar de puntero compartido (si corresponde). |
## Campos

| Campo | Descripción |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Umbral de creación del diccionario de búsqueda, predeterminado. |

## Ver también

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
