---
title: "System::Array Klasse"
linktitle: "Array"
second_title: "Aspose.Font für C++"
description: "System::Array Klasse. Klasse, die eine Array-Datenstruktur repräsentiert. Objekte dieser Klasse sollten nur mit den Funktionen System::MakeArray() und System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system/array/
---
## Array class


Klasse, die eine Array-Datenstruktur repräsentiert. Objekte dieser Klasse sollten nur mit den Funktionen [System::MakeArray()](../makearray/) und [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/) Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ der Elemente eines Arrays |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const T\&) override | Nicht unterstützt, weil das vom aktuellen Objekt dargestellte Array schreibgeschützt ist. |
| [Array](./array/)() | Konstruiert ein leeres Array. |
| [Array](./array/)(int, const T\&) | Füllkonstruktor. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Füllkonstruktor. |
| [Array](./array/)(int, const T) | Füllkonstruktor. |
| [Array](./array/)(vector_t\&&) | Move-Konstruktor. |
| [Array](./array/)(const vector_t\&) | Kopierkonstruktor. |
| [Array](./array/)(const std::vector\<Q\>\&) | Konstruiert ein [Array](./)-Objekt und füllt es mit Werten, die aus einem std::vector-Objekt kopiert wurden, dessen Werttyp derselbe wie **T** ist, aber sich von **[UnderlyingType](./underlyingtype/)** unterscheidet. |
| [Array](./array/)(std::vector\<Q\>\&&) | Konstruiert ein [Array](./)-Objekt und füllt es mit Werten, die aus einem std::vector-Objekt verschoben wurden, dessen Werttyp derselbe wie **T** ist, aber sich von **[UnderlyingType](./underlyingtype/)** unterscheidet. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Konstruiert ein [Array](./)-Objekt und füllt es mit Werten aus der angegebenen Initialisierungsliste, die Elemente des Typs **[UnderlyingType](./underlyingtype/)** enthält. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Konstruiert ein [Array](./)-Objekt und füllt es mit Werten aus dem angegebenen Array, das Elemente des Typs **[UnderlyingType](./underlyingtype/)** enthält. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Konstruiert ein [Array](./)-Objekt und füllt es mit Werten aus der angegebenen Initialisierungsliste, die Elemente des Typs bool enthält. |
| [begin](./begin/)() | Gibt einen Iterator auf das erste Element des Containers zurück. Ist der Container leer, ist der zurückgegebene Iterator gleich [end()](./end/). |
| [begin](./begin/)() const | Gibt einen Iterator auf das erste Element des const‑qualifizierten Containers zurück. Ist der Container leer, ist der zurückgegebene Iterator gleich [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Führt eine binäre Suche im sortierten Array durch. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | NICHT IMPLEMENTIERT. |
| [cbegin](./cbegin/)() const | Gibt einen Iterator auf das erste const‑qualifizierte Element des Containers zurück. Ist der Container leer, ist der zurückgegebene Iterator gleich [cend()](./cend/). |
| [cend](./cend/)() const | Gibt einen Iterator auf das Element zurück, das dem letzten Element des Containers folgt. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [Clear](./clear/)() override | Nicht unterstützt, weil das vom aktuellen Objekt dargestellte Array schreibgeschützt ist. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Ersetzt **count** Werte, beginnend beim Index **startIndex**, im angegebenen Array durch Standardwerte. |
| [Clone](./clone/)() | Klont das Array. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopiert einen Bereich von Elementen aus einem [System.Array](./), beginnend beim angegebenen Quell. |
| [Contains](./contains/)(const T\&) const override | Bestimmt, ob das angegebene Element im Array ist. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Erstellt ein neues [Array](./)-Objekt und füllt es mit Elementen des angegebenen Arrays, die mithilfe des angegebenen Converter-Delegaten in den Typ **OutputType** konvertiert wurden. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Erstellt ein neues [Array](./)-Objekt und füllt es mit Elementen des angegebenen Arrays, die mithilfe des angegebenen Converter-Funktionsobjekts in den Typ **OutputType** konvertiert wurden. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Kopiert die angegebene Anzahl von Elementen vom Quellarray zum Zielarray. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Kopiert die angegebene Anzahl von Elementen von der Quell-Array-Ansicht zum Zielarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Kopiert die angegebene Anzahl von Elementen vom Quellarray zur Ziel-Array-Ansicht. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Kopiert die angegebene Anzahl von Elementen von der Quell-Array-Ansicht zur Ziel-Array-Ansicht. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Kopiert die angegebene Anzahl von Elementen vom Quellarray im Stack zum Zielarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Kopiert die angegebene Anzahl von Elementen vom Quellarray zum Zielarray im Stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Kopiert die angegebene Anzahl von Elementen vom Quellarray im Stack zum Zielarray im Stack. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen aus dem Quellarray, beginnend beim angegebenen Index, zur angegebenen Position im Zielarray. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen aus der Quell-Array-Ansicht, beginnend beim angegebenen Index, zur angegebenen Position im Zielarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen aus dem Quellarray, beginnend beim angegebenen Index, zur angegebenen Position in der Ziel-Array-Ansicht. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen aus der Quell-Array-Ansicht, beginnend beim angegebenen Index, zur angegebenen Position in der Ziel-Array-Ansicht. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen vom Quellarray im Stack, beginnend beim angegebenen Index, zur angegebenen Position im Zielarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen aus dem Quellarray, beginnend beim angegebenen Index, zur angegebenen Position im Zielarray im Stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen vom Quellarray im Stack, beginnend beim angegebenen Index, zur angegebenen Position im Zielarray im Stack. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Kopiert eine angegebene Anzahl von Elementen aus der Quell-Array-Ansicht, beginnend beim angegebenen Index, zur angegebenen Position im Zielarray im Stack. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopiert alle Elemente des aktuellen Arrays in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend beim durch das Argument arrayIndex angegebenen Index. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Kopiert alle Elemente des aktuellen Arrays in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend beim durch das Argument dstIndex angegebenen Index. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Kopiert alle Elemente des aktuellen Arrays in die angegebene Ziel-Array-Ansicht. Elemente werden in die Ziel-Array-Ansicht eingefügt, beginnend beim durch das Argument dstIndex angegebenen Index. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Kopiert eine angegebene Anzahl von Elementen aus dem aktuellen Array, beginnend bei der angegebenen Position, in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend beim durch das Argument dstIndex angegebenen Index. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Kopiert eine angegebene Anzahl von Elementen aus dem aktuellen Array, beginnend an der angegebenen Position, in die angegebene Ziel-Array-Ansicht. Elemente werden in die Ziel-Array-Ansicht eingefügt, beginnend bei dem Index, der durch das Argument dstIndex angegeben ist. |
| [Count](./count/)() const | Gibt eine Zahl zurück, die die Gesamtzahl aller Elemente in allen Dimensionen des Arrays darstellt. |
| [crbegin](./crbegin/)() const | Gibt einen Reverse‑Iterator auf das erste Element des umgekehrten Containers zurück. Er entspricht dem letzten Element des nicht umgekehrten Containers. Ist der Container leer, ist der zurückgegebene Iterator gleich [crend()](./crend/). |
| [crend](./crend/)() const | Gibt einen Reverse‑Iterator auf das Element zurück, das dem letzten Element des umgekehrten Containers folgt. Er entspricht dem Element, das dem ersten Element des nicht umgekehrten Containers vorausgeht. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [data](./data/)() | Gibt eine Referenz auf die interne Datenstruktur zurück, die zum Speichern der Array-Elemente verwendet wird. |
| [data](./data/)() const | Gibt eine konstante Referenz auf die interne Datenstruktur zurück, die zum Speichern der Array-Elemente verwendet wird. |
| [data_ptr](./data_ptr/)() | Gibt einen rohen Zeiger auf den Anfang des Speicherpuffers zurück, in dem die Array-Elemente gespeichert sind. |
| [data_ptr](./data_ptr/)() const | Gibt einen konstanten rohen Zeiger auf den Anfang des Speicherpuffers zurück, in dem die Array-Elemente gespeichert sind. |
| [end](./end/)() | Gibt einen Iterator auf das Element zurück, das dem letzten Element des Containers folgt. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [end](./end/)() const | Gibt einen Iterator auf das Element zurück, das dem letzten Element des const‑qualifizierten Containers folgt. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Bestimmt, ob das angegebene [Array](./)-Objekt ein Element enthält, das die Anforderungen des angegebenen Prädikats erfüllt. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Durchsucht das angegebene Array nach dem ersten Element, das die Bedingungen des angegebenen Prädikats erfüllt. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Ruft alle Elemente ab, die den durch das angegebene Prädikat definierten Bedingungen entsprechen. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Durchsucht das angegebene Array nach dem ersten Element, das die Bedingungen des angegebenen Prädikats erfüllt. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Führt die angegebene Aktion für jedes Element des angegebenen Arrays aus. |
| [get_Count](./get_count/)() const override | Gibt die Größe des Arrays zurück. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Gibt an, ob das Array schreibgeschützt ist. |
| [get_Length](./get_length/)() const | Gibt einen 32‑Bit‑Integer zurück, der die Gesamtzahl aller Elemente in allen Dimensionen des Arrays darstellt. |
| [get_LongLength](./get_longlength/)() const | Gibt einen 64‑Bit‑Integer zurück, der die Gesamtzahl aller Elemente in allen Dimensionen des Arrays darstellt. |
| [get_Rank](./get_rank/)() const | NICHT IMPLEMENTIERT. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Zeiger auf das [Enumerator](./enumerator/)-Objekt zurück, das die IEnumerator‑Schnittstelle für die Elemente des vom aktuellen Objekt repräsentierten Arrays bereitstellt. |
| [GetLength](./getlength/)(int) | Gibt die Anzahl der Elemente in der angegebenen Dimension zurück. |
| [GetLongLength](./getlonglength/)(int) | Gibt die Anzahl der Elemente in der angegebenen Dimension als 64‑Bit‑Integer zurück. |
| [GetLowerBound](./getlowerbound/)(int) const | Gibt die untere Grenze der angegebenen Dimension zurück. |
| [GetSizeTLength](./getsizetlength/)() const | Gibt eine std::size_t‑Variable zurück, die die Gesamtzahl aller Elemente in allen Dimensionen des Arrays darstellt. |
| [GetUpperBound](./getupperbound/)(int) | Gibt die obere Grenze der angegebenen Dimension zurück. |
| [idx_get](./idx_get/)(int) const override | Gibt das Element am angegebenen Index zurück. |
| [idx_set](./idx_set/)(int, T) override | Setzt den angegebenen Wert als Element des Arrays am angegebenen Index. |
| [IndexOf](./indexof/)(const T\&) const override | Bestimmt den Index des ersten Vorkommens des angegebenen Elements im Array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Bestimmt den Index des ersten Vorkommens des angegebenen Elements im Array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Bestimmt den Index des ersten Vorkommens des angegebenen Elements im Array, beginnend beim angegebenen Index. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Bestimmt den Index des ersten Vorkommens des angegebenen Elements in einem Bereich von Elementen des Arrays, der durch den Startindex und die Anzahl der Elemente im Bereich festgelegt ist. |
| [Init](./init/)(const T) | Füllt das vom aktuellen Objekt dargestellte Array mit den Werten aus dem angegebenen Array. |
| [Initialize](./initialize/)() | Füllt das Array mit den standardmäßig konstruierten Objekten vom Typ **T**. |
| [Insert](./insert/)(int, const T\&) override | Nicht unterstützt, weil das vom aktuellen Objekt dargestellte Array schreibgeschützt ist. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Bestimmt den Index des letzten Vorkommens des angegebenen Elements in einem Bereich von Elementen des Arrays, der durch den Startindex und die Anzahl der Elemente im Bereich festgelegt ist. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Bestimmt den Index des letzten Vorkommens des angegebenen Elements im Array, beginnend beim angegebenen Index. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Bestimmt den Index des letzten Vorkommens des angegebenen Elements im Array. |
| [Max](./max/)() const | Findet das größte Element im Array unter Verwendung von [operator<()](../operator_/) zum Vergleich der Elemente. |
| [Min](./min/)() const | Findet das kleinste Element im Array unter Verwendung von [operator<()](../operator_/) zum Vergleich der Elemente. |
| [operator[]](./operator[]/)(int) | Gibt ein Element am angegebenen Index zurück. |
| [operator[]](./operator[]/)(int) const | Gibt ein Element am angegebenen Index zurück. |
| [rbegin](./rbegin/)() | Gibt einen Reverse-Iterator auf das erste Element des umgekehrten Containers zurück. Er entspricht dem letzten Element des nicht umgekehrten Containers. Wenn der Container leer ist, ist der zurückgegebene Iterator gleich [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator auf das erste Element des umgekehrten Containers zurück. Er entspricht dem letzten Element des nicht umgekehrten Containers. Wenn der Container leer ist, ist der zurückgegebene Iterator gleich [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | Nicht unterstützt, weil das vom aktuellen Objekt dargestellte Array schreibgeschützt ist. |
| [RemoveAt](./removeat/)(int) override | Nicht unterstützt, weil das vom aktuellen Objekt dargestellte Array schreibgeschützt ist. |
| [rend](./rend/)() | Gibt einen Reverse‑Iterator auf das Element zurück, das dem letzten Element des umgekehrten Containers folgt. Er entspricht dem Element, das dem ersten Element des nicht umgekehrten Containers vorausgeht. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| [rend](./rend/)() const | Gibt einen Reverse‑Iterator auf das Element zurück, das dem letzten Element des umgekehrten Containers folgt. Er entspricht dem Element, das dem ersten Element des nicht umgekehrten Containers vorausgeht. Dieses Element dient als Platzhalter; ein Zugriff darauf führt zu undefiniertem Verhalten. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Ändert die Größe des angegebenen Arrays auf den angegebenen Wert oder erstellt ein neues Array mit der angegebenen Größe. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Kehrt die Elemente im angegebenen Array um. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Kehrt einen Bereich von Elementen im angegebenen Array um. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Lässt das Array gespeicherte Zeiger als schwach behandeln (falls zutreffend). |
| [SetValue](./setvalue/)(const T\&, int) | Setzt den Wert des Elements am angegebenen Index. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Sortiert die Elemente im angegebenen Array mit dem Standardvergleich. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Sortiert einen Bereich von Elementen im angegebenen Array mit dem Standardvergleich. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Sortiert die Elemente im angegebenen Array mit dem angegebenen Vergleich. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | NICHT IMPLEMENTIERT. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Sortiert zwei Arrays, eines mit Schlüsseln und das andere - zugehörige Elemente, basierend auf den Werten des Schlüssel‑Arrays, dessen Elemente mit operator< verglichen werden. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Sortiert zwei Arrays, eines mit Schlüsseln und das andere - zugehörige Elemente, basierend auf den Werten des Schlüssel‑Arrays, dessen Elemente mit dem Standardvergleich verglichen werden. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Bestimmt, ob alle Elemente im angegebenen Array die durch das angegebene Prädikat definierten Bedingungen erfüllen. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [const_reverse_iterator](./const_reverse_iterator/) | Typ des konstanten Reverse-Iterators. |
| [EnumerablePtr](./enumerableptr/) | Ein Alias für den Shared‑Pointer‑Typ, der auf ein IEnumerable‑Objekt zeigt, das Elemente vom Typ **T** enthält. |
| [EnumeratorPtr](./enumeratorptr/) | Ein Alias für den Shared‑Pointer‑Typ, der auf ein IEnumerator‑Objekt zeigt, das Elemente vom Typ **T** enthält. |
| [iterator](./iterator/) | Iteratortyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iteratortyp. |
| [UnderlyingType](./underlyingtype/) | Alias für den Typ, der verwendet wird, um jedes Element des Arrays darzustellen. |
| [ValueType](./valuetype/) | Alias für den Typ der Elemente des Arrays. |
## Hinweise



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Erstelle und fülle das Array.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Gib die Array-Elemente aus.
  Print(arrayPtr);

  // Sortiere die Array-Elemente aufsteigend.
  Array<int32_t>::Sort(arrayPtr);

  // Gib die Array-Elemente aus.
  Print(arrayPtr);

  // Gib die Anzahl der Array-Elemente aus.
  std::cout << arrayPtr->get_Length() << std::endl;

  // Gib den Index des Elements aus, das gleich 4 ist.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Passe die Größe des Arrays an.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Gib die Array-Elemente aus.
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## Siehe auch

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
