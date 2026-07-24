---
title: "System::Array klasse"
linktitle: "Array"
second_title: "Aspose.Page voor C++"
description: "System::Array klasse. Klasse die een array‑datastructuur vertegenwoordigt. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functies System::MakeArray() en System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Omhul altijd deze klasse in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system/array/
---
## Array class


Klasse die een array‑datastructuur vertegenwoordigt. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functies [System::MakeArray()](../makearray/) en [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Omhul altijd deze klasse in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van elementen van een array |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const T\&) override | Niet ondersteund omdat de array die door het huidige object wordt weergegeven alleen-lezen is. |
| [Array](./array/)() | Construeert een lege array. |
| [Array](./array/)(int, const T\&) | Vullende constructor. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Vullende constructor. |
| [Array](./array/)(int, const T) | Vullende constructor. |
| [Array](./array/)(vector_t\&&) | Move-constructor. |
| [Array](./array/)(const vector_t\&) | Copy-constructor. |
| [Array](./array/)(const std::vector\<Q\>\&) | Construeert een [Array](./)-object en vult het met waarden gekopieerd uit een std::vector-object waarvan het type van de waarden hetzelfde is als **T**, maar verschillend van **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::vector\<Q\>\&&) | Construeert een [Array](./)-object en vult het met waarden verplaatst uit een std::vector-object waarvan het type van de waarden hetzelfde is als **T**, maar verschillend van **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Construeert een [Array](./)-object en vult het met waarden uit de opgegeven initializer‑list die elementen van het type **[UnderlyingType](./underlyingtype/)** bevat. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Construeert een [Array](./)-object en vult het met waarden uit de opgegeven array die elementen van het type **[UnderlyingType](./underlyingtype/)** bevat. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Construeert een [Array](./)-object en vult het met waarden uit de opgegeven initializer‑list die elementen van het type bool bevat. |
| [begin](./begin/)() | Retourneert een iterator naar het eerste element van de container. Als de container leeg is, is de geretourneerde iterator gelijk aan [end()](./end/). |
| [begin](./begin/)() const | Retourneert een iterator naar het eerste element van de const-gekwalificeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Voert een binaire zoekopdracht uit in de gesorteerde array. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | NOG NIET GEÏMPLENTEERD. |
| [cbegin](./cbegin/)() const | Retourneert een iterator naar het eerste const-gekwalificeerde element van de container. Als de container leeg is, is de geretourneerde iterator gelijk aan [cend()](./cend/). |
| [cend](./cend/)() const | Retourneert een iterator naar het element dat volgt op het laatste element van de container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [Clear](./clear/)() override | Niet ondersteund omdat de array die door het huidige object wordt weergegeven alleen-lezen is. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Vervangt **count** waarden beginnend bij de index **startIndex** in de opgegeven array door standaardwaarden. |
| [Clone](./clone/)() | Kloont de array. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopieert een reeks elementen van een [System.Array](./) beginnend bij de opgegeven bron. |
| [Contains](./contains/)(const T\&) const override | Bepaalt of het opgegeven item zich in de array bevindt. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Construeert een nieuw [Array](./)-object en vult het met elementen van de opgegeven array die geconverteerd zijn naar het type **OutputType** met behulp van de opgegeven converter‑delegate. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Construeert een nieuw [Array](./)-object en vult het met elementen van de opgegeven array die geconverteerd zijn naar het type **OutputType** met behulp van het opgegeven converter‑functiesobject. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Kopieert het opgegeven aantal elementen van de bronarray naar de doelarray. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Kopieert het opgegeven aantal elementen van de bron‑array‑view naar de doelarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Kopieert het opgegeven aantal elementen van de bronarray naar de doel‑array‑view. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Kopieert het opgegeven aantal elementen van de bron‑array‑view naar de doel‑array‑view. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Kopieert het opgegeven aantal elementen van de bronarray op de stack naar de doelarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Kopieert het opgegeven aantal elementen van de bronarray naar de doelarray op de stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Kopieert het opgegeven aantal elementen van de bronarray op de stack naar de doelarray op de stack. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarray beginnend bij de opgegeven index naar de opgegeven positie in de doelarray. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarrayweergave beginnend bij de opgegeven index naar de opgegeven positie in de doelarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarray beginnend bij de opgegeven index naar de opgegeven positie in de doelarrayweergave. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarrayweergave beginnend bij de opgegeven index naar de opgegeven positie in de doelarrayweergave. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarray op de stack beginnend bij de opgegeven index naar de opgegeven positie in de doelarray. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarray beginnend bij de opgegeven index naar de opgegeven positie in de doelarray op de stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarray op de stack beginnend bij de opgegeven index naar de opgegeven positie in de doelarray op de stack. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Kopieert een opgegeven aantal elementen van de bronarrayweergave beginnend bij de opgegeven index naar de opgegeven positie in de doelarray op de stack. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopieert alle elementen van de huidige array naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument arrayIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Kopieert alle elementen van de huidige array naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Kopieert alle elementen van de huidige array naar de opgegeven doelarrayweergave. Elementen worden in de doelarrayweergave ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Kopieert een opgegeven aantal elementen van de huidige array beginnend bij de opgegeven positie naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Kopieert een opgegeven aantal elementen van de huidige array beginnend bij de opgegeven positie naar de opgegeven doelarrayweergave. Elementen worden in de doelarrayweergave ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex. |
| [Count](./count/)() const | Retourneert een getal dat het totale aantal elementen in alle dimensies van de array weergeeft. |
| [crbegin](./crbegin/)() const | Retourneert een reverse-iterator naar het eerste element van de omgekeerde container. Het correspondeert met het laatste element van de niet-omgekeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [crend()](./crend/). |
| [crend](./crend/)() const | Retourneert een reverse-iterator naar het element dat volgt op het laatste element van de omgekeerde container. Het correspondeert met het element dat voorafgaat aan het eerste element van de niet-omgekeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [data](./data/)() | Retourneert een referentie naar de interne datastructuur die wordt gebruikt om de array‑elementen op te slaan. |
| [data](./data/)() const | Retourneert een constante referentie naar de interne datastructuur die wordt gebruikt om de array‑elementen op te slaan. |
| [data_ptr](./data_ptr/)() | Retourneert een ruwe pointer naar het begin van de geheugenbuffer waarin de array‑elementen worden opgeslagen. |
| [data_ptr](./data_ptr/)() const | Retourneert een constante ruwe pointer naar het begin van de geheugenbuffer waarin de array‑elementen worden opgeslagen. |
| [end](./end/)() | Retourneert een iterator naar het element dat volgt op het laatste element van de container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [end](./end/)() const | Retourneert een iterator naar het element dat volgt op het laatste element van de const-gekwalificeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Bepaalt of het opgegeven [Array](./)‑object een element bevat dat voldoet aan de eisen van het opgegeven predicaat. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Zoekt naar het eerste element in de opgegeven array dat voldoet aan de voorwaarden van het opgegeven predicaat. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Haalt alle elementen op die voldoen aan de door het opgegeven predicaat gedefinieerde voorwaarden. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Zoekt naar het eerste element in de opgegeven array dat voldoet aan de voorwaarden van het opgegeven predicaat. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Voert de opgegeven actie uit op elk element van de opgegeven array. |
| [get_Count](./get_count/)() const override | Retourneert de grootte van de array. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Geeft aan of de array alleen-lezen is. |
| [get_Length](./get_length/)() const | Retourneert een 32‑bit integer die het totale aantal elementen in alle dimensies van de array weergeeft. |
| [get_LongLength](./get_longlength/)() const | Retourneert een 64‑bit integer die het totale aantal elementen in alle dimensies van de array weergeeft. |
| [get_Rank](./get_rank/)() const | NOG NIET GEÏMPLENTEERD. |
| [GetEnumerator](./getenumerator/)() override | Retourneert een pointer naar het [Enumerator](./enumerator/) object dat een IEnumerator‑interface biedt voor de elementen van de array die door het huidige object wordt vertegenwoordigd. |
| [GetLength](./getlength/)(int) | Retourneert het aantal elementen in de opgegeven dimensie. |
| [GetLongLength](./getlonglength/)(int) | Retourneert het aantal elementen in de opgegeven dimensie als 64‑bit geheel getal. |
| [GetLowerBound](./getlowerbound/)(int) const | Retourneert de ondergrens van de opgegeven dimensie. |
| [GetSizeTLength](./getsizetlength/)() const | Retourneert een std::size_t‑variabele die het totale aantal elementen in alle dimensies van de array weergeeft. |
| [GetUpperBound](./getupperbound/)(int) | Retourneert de bovengrens van de opgegeven dimensie. |
| [idx_get](./idx_get/)(int) const override | Retourneert het item op de opgegeven index. |
| [idx_set](./idx_set/)(int, T) override | Stelt de opgegeven waarde in als het item van de array op de opgegeven index. |
| [IndexOf](./indexof/)(const T\&) const override | Bepaalt de index van de eerste voorkoming van het opgegeven item in de array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Bepaalt de index van de eerste voorkoming van het opgegeven item in de array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Bepaalt de index van de eerste voorkoming van het opgegeven item in de array, beginnend vanaf de opgegeven index. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Bepaalt de index van de eerste voorkoming van het opgegeven item in een bereik van items van de array, gespecificeerd door de startindex en het aantal elementen in het bereik. |
| [Init](./init/)(const T) | Vult de door het huidige object vertegenwoordigde array met de waarden uit de opgegeven array. |
| [Initialize](./initialize/)() | Vult de array met de standaard geconstrueerde objecten van type **T**. |
| [Insert](./insert/)(int, const T\&) override | Niet ondersteund omdat de door het huidige object vertegenwoordigde array alleen-lezen is. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Bepaalt de index van de laatste voorkoming van het opgegeven item in een bereik van items van de array, gespecificeerd door de startindex en het aantal elementen in het bereik. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Bepaalt de index van de laatste voorkoming van het opgegeven item in de array, beginnend vanaf de opgegeven index. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Bepaalt de index van de laatste voorkoming van het opgegeven item in de array. |
| [Max](./max/)() const | Vindt het grootste element in de array met behulp van [operator<()](../operator_/) om elementen te vergelijken. |
| [Min](./min/)() const | Vindt het kleinste element in de array met behulp van [operator<()](../operator_/) om elementen te vergelijken. |
| [operator[]](./operator[]/)(int) | Retourneert een item op de opgegeven index. |
| [operator[]](./operator[]/)(int) const | Retourneert een item op de opgegeven index. |
| [rbegin](./rbegin/)() | Retourneert een reverse-iterator naar het eerste element van de omgekeerde container. Het correspondeert met het laatste element van de niet-omgekeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Retourneert een reverse-iterator naar het eerste element van de omgekeerde container. Het correspondeert met het laatste element van de niet-omgekeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | Niet ondersteund omdat de array die door het huidige object wordt weergegeven alleen-lezen is. |
| [RemoveAt](./removeat/)(int) override | Niet ondersteund omdat de door het huidige object vertegenwoordigde array alleen-lezen is. |
| [rend](./rend/)() | Retourneert een reverse-iterator naar het element dat volgt op het laatste element van de omgekeerde container. Het correspondeert met het element dat voorafgaat aan het eerste element van de niet-omgekeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [rend](./rend/)() const | Retourneert een reverse-iterator naar het element dat volgt op het laatste element van de omgekeerde container. Het correspondeert met het element dat voorafgaat aan het eerste element van de niet-omgekeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Wijzigt de grootte van de opgegeven array naar de opgegeven waarde of maakt een nieuwe array met de opgegeven grootte. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Keert de elementen in de opgegeven array om. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Keert een bereik van elementen in de opgegeven array om. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Laat de array opgeslagen pointers als zwak behandelen (indien van toepassing). |
| [SetValue](./setvalue/)(const T\&, int) | Stelt de waarde van het element op de opgegeven index in. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Sorteert elementen in de opgegeven array met behulp van de standaardvergelijker. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Sorteert een bereik van elementen in de opgegeven array met behulp van de standaardvergelijker. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Sorteert elementen in de opgegeven array met behulp van de opgegeven vergelijker. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | NOG NIET GEÏMPLENTEERD. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Sorteert twee arrays, één met sleutels en de andere - overeenkomstige items, gebaseerd op de waarden van de array met sleutels, waarvan de elementen worden vergeleken met behulp van operator<. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Sorteert twee arrays, één met sleutels en de andere - overeenkomstige items, gebaseerd op de waarden van de array met sleutels, waarvan de elementen worden vergeleken met behulp van de standaardvergelijker. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Bepaalt of alle elementen in de opgegeven array voldoen aan de voorwaarden die door het opgegeven predicaat zijn gedefinieerd. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse-iterator type. |
| [EnumerablePtr](./enumerableptr/) | Een alias voor een shared pointer-type dat naar een IEnumerable-object wijst dat elementen van type **T** bevat. |
| [EnumeratorPtr](./enumeratorptr/) | Een alias voor een shared pointer-type dat naar een IEnumerator-object wijst dat elementen van type **T** bevat. |
| [iterator](./iterator/) | Iterator type. |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
| [UnderlyingType](./underlyingtype/) | Alias voor het type dat wordt gebruikt om elk element van de array te vertegenwoordigen. |
| [ValueType](./valuetype/) | Alias voor het type van de elementen van de array. |
## Opmerkingen



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
  // Maak en vul de array.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Print de array-items.
  Print(arrayPtr);

  // Sorteer de array-items oplopend.
  Array<int32_t>::Sort(arrayPtr);

  // Print de array-items.
  Print(arrayPtr);

  // Print het aantal van de array-items.
  std::cout << arrayPtr->get_Length() << std::endl;

  // Print de index van het item dat gelijk is aan 4.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Wijzig de grootte van de array.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Print de array-items.
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

## Zie ook

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
