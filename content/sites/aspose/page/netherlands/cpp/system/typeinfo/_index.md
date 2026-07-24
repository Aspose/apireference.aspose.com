---
title: "System::TypeInfo klasse"
linktitle: "TypeInfo"
second_title: "Aspose.Page voor C++"
description: "System::TypeInfo klasse. Stelt een specifiek type voor en biedt informatie erover in C++."
type: docs
weight: 6600
url: /nl/cpp/system/typeinfo/
---
## TypeInfo class


Stelt een specifiek type voor en biedt er informatie over.

```cpp
class TypeInfo
```

## Nested classes

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Voegt het opgegeven attribuut toe aan de lijst van type-attributen. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Stelt de standaardconstructor in voor het type T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Stelt de standaardconstructor in via de functor die een klasse‑instantie maakt. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Voegt het opgegeven lid toe aan de lijst van leden van het type. |
| static [BoxedValueType](./boxedvaluetype/)() | Biedt een unieke [TypeInfo](./) structuur voor het type [BoxedValue](./boxedvalue/) die gedeeld kan worden door meerdere Boxed*-klassen. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | NIET GEREALISEERD. Retourneert een pointer naar de assembly waarin het type dat door het huidige object wordt vertegenwoordigd, is gedeclareerd. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | NIET GEREALISEERD. Retourneert de volledig gekwalificeerde naam inclusief de assembly‑naam van het type dat door het huidige object wordt vertegenwoordigd. |
| [get_BaseType](./get_basetype/)() const | Retourneert de basis‑type descriptor. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Haalt een waarde op die aangeeft of het huidige Type‑object type‑parameters heeft die nog niet zijn vervangen door specifieke types. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Haalt een lijst op van de leden met de opgegeven naam. |
| [get_FullName](./get_fullname/)() const | Retourneert de volledig gekwalificeerde naam (maar zonder de assembly‑naam) van het type dat door het huidige object wordt vertegenwoordigd. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Haalt een array op van de generieke type‑argumenten voor dit type. |
| [get_IsAbstract](./get_isabstract/)() const | Haalt een waarde op die aangeeft of het Type abstract is en moet worden overschreven. |
| [get_IsArray](./get_isarray/)() const | Haalt een waarde op die aangeeft of het type een array is. |
| [get_IsClass](./get_isclass/)() const | Haalt een waarde op die aangeeft of het Type een klasse of een delegate is; dat wil zeggen, geen waardetype of interface. |
| [get_IsEnum](./get_isenum/)() const | Haalt een waarde op die aangeeft of het huidige Type een enumeratie vertegenwoordigt. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Haalt een waarde op die aangeeft of het huidige Type een generieke type‑definitie vertegenwoordigt, waaruit andere generieke types kunnen worden geconstrueerd. |
| [get_IsInterface](./get_isinterface/)() const | Haalt een waarde op die aangeeft of het Type een interface is; dat wil zeggen, geen klasse of waardetype. |
| [get_IsSealed](./get_issealed/)() const | Haalt een waarde op die aangeeft of het Type als sealed is gedeclareerd. |
| [get_IsValueType](./get_isvaluetype/)() const | Haalt een waarde op die aangeeft of het Type een waardetype is. |
| [get_IsVisible](./get_isvisible/)() const | Haalt een waarde op die aangeeft of het Type toegankelijk is voor code buiten de assembly. |
| [get_Name](./get_name/)() const | Retourneert de naam van het type dat door het huidige object wordt vertegenwoordigd. |
| [get_Namespace](./get_namespace/)() const | Haalt de namespace van het Type op. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Zoekt naar een openbare instantie‑constructor waarvan de parameters overeenkomen met de types in de opgegeven array. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | Zoekt naar de constructors die voor het huidige Type zijn gedefinieerd, met behulp van de opgegeven BindingFlags. |
| [GetConstructors](./getconstructors/)() const | Retourneert alle openbare constructors die voor het huidige Type zijn gedefinieerd. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Zoekt naar het aangepaste attribuut met het opgegeven type dat is toegepast op het type dat door het huidige object wordt vertegenwoordigd. |
| [GetCustomAttributes](./getcustomattributes/)() const | Retourneert een array met objecten die alle aangepaste attributen die op het type zijn toegepast vertegenwoordigen. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Retourneert een array met objecten die specifieke attributen die op het type zijn toegepast vertegenwoordigen. |
| [GetElementType](./getelementtype/)() const | NOG NIET GEÏMPLENTEERD. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Zoekt naar het opgegeven veld, met behulp van de opgegeven bindingsbeperkingen. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Zoekt naar de velden die voor het huidige Type zijn gedefinieerd, met behulp van de opgegeven bindingsbeperkingen. |
| [GetGenericArguments](./getgenericarguments/)() const | Haalt een array op van de generieke type‑argumenten voor dit type. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode die aan deze instantie is gekoppeld. |
| [GetInterfaces](./getinterfaces/)() const | Haalt alle interfaces op die door het huidige Type zijn geïmplementeerd of geërfd. |
| [GetMember](./getmember/)(const String\&) const | Haalt een lijst op van de leden met de opgegeven naam. |
| [GetMethod](./getmethod/)(const String\&) const | Haalt de methode op met de opgegeven naam. |
| [GetProperties](./getproperties/)() const | Retourneert alle openbare eigenschappen van het huidige Type. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Zoekt naar de eigenschappen van het huidige Type, met behulp van de opgegeven bindingsbeperkingen. |
| [GetTemplParamType](./gettemplparamtype/)() const | Haalt de typebeschrijving van de sjabloonparameter op. |
| [Hash](./hash/)() const | Retourneert een hashwaarde die aan het type dat door het huidige object wordt vertegenwoordigd, is gekoppeld. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Bepaalt of een instantie van een opgegeven type kan worden toegewezen aan een variabele van het huidige type. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | NIET GEREALISEERD. Geeft aan of één of meer attributen van het opgegeven type of van afgeleide types op dit lid zijn toegepast. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Bepaalt of het opgegeven object een instantie is van het huidige type. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Bepaalt of het type dat door het huidige object wordt vertegenwoordigd, een subklasse is van de opgegeven klasse. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Bepaalt of het huidige en het opgegeven [TypeInfo](./)-object niet gelijk zijn. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Bepaalt of het huidige [TypeInfo](./)-object geen null-object is, d.w.z. het vertegenwoordigt een type. |
| [operator==](./operator==/)(const TypeInfo\&) const | Bepaalt of het huidige en het opgegeven [TypeInfo](./)-object gelijk zijn. |
| [operator==](./operator==/)(std::nullptr_t) const | Bepaalt of het huidige [TypeInfo](./)-object een null-object is, d.w.z. het vertegenwoordigt geen type. |
| [reset](./reset/)() | Stelt [TypeInfo](./) in op null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Stelt een waarde in die aangeeft of het Type een waardetype is. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Stelt de basis-typebeschrijving in. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Stelt de typebeschrijving van de sjabloonparameter in. |
| static [StringHash](./stringhash/)(const char_t *) | Bereken de hash voor de opgegeven string. |
| [ToString](./tostring/)() const | Retourneert een string die de naam bevat van het type dat door het huidige object wordt vertegenwoordigd. |
| static [Type](./type/)() | Retourneert een [TypeInfo](./) object dat de [TypeInfo](./) klasse vertegenwoordigt. |
| [TypeInfo](./typeinfo/)() | Standaardconstructor (geen type ingesteld). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Nullobjectconstructor (geen type ingesteld). |
| [TypeInfo](./typeinfo/)(const char_t *) | Constructor. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Constructor. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [EmptyType](./emptytype/) | Constante die een lege lijst van [TypeInfo](./) vertegenwoordigt. |
| static [EmptyTypes](./emptytypes/) | Constante die een lege lijst van [TypeInfo](./) vertegenwoordigt. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Functie‑pointer om een type te construeren. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
