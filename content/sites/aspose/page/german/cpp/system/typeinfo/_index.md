---
title: "System::TypeInfo Klasse"
linktitle: "TypeInfo"
second_title: "Aspose.Page für C++"
description: "System::TypeInfo Klasse. Repräsentiert einen bestimmten Typ und liefert Informationen darüber in C++."
type: docs
weight: 6600
url: /de/cpp/system/typeinfo/
---
## TypeInfo class


Stellt einen bestimmten Typ dar und liefert Informationen darüber.

```cpp
class TypeInfo
```

## Nested classes

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Fügt das angegebene Attribut zur Liste der Attribute des Typs hinzu. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Setzt den Standardkonstruktor für den Typ T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Setzt den Standardkonstruktor über den Funktor, der eine Klasseninstanz erstellt. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Fügt das angegebene Mitglied zur Liste der Mitglieder des Typs hinzu. |
| static [BoxedValueType](./boxedvaluetype/)() | Stellt eine eindeutige [TypeInfo](./) Struktur für den Typ [BoxedValue](./boxedvalue/) bereit, die von mehreren Boxed*-Klassen gemeinsam genutzt wird. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | NICHT IMPLEMENTIERT. Gibt einen Zeiger auf die Assembly zurück, in der der vom aktuellen Objekt repräsentierte Typ deklariert ist. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | NICHT IMPLEMENTIERT. Gibt den vollqualifizierten Namen einschließlich des Assembly-Namens des vom aktuellen Objekt repräsentierten Typs zurück. |
| [get_BaseType](./get_basetype/)() const | Gibt den Basistyp-Deskriptor zurück. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Ermittelt einen Wert, der angibt, ob das aktuelle Type-Objekt Typparameter hat, die nicht durch konkrete Typen ersetzt wurden. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Ermittelt die Liste der Mitglieder mit dem angegebenen Namen. |
| [get_FullName](./get_fullname/)() const | Gibt den vollständig qualifizierten Namen (aber ohne den Assembly-Namen) des vom aktuellen Objekt dargestellten Typs zurück. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Ruft ein Array der generischen Typargumente für diesen Typ ab. |
| [get_IsAbstract](./get_isabstract/)() const | Ruft einen Wert ab, der angibt, ob der Typ abstrakt ist und überschrieben werden muss. |
| [get_IsArray](./get_isarray/)() const | Ruft einen Wert ab, der angibt, ob der Typ ein Array ist. |
| [get_IsClass](./get_isclass/)() const | Ruft einen Wert ab, der angibt, ob der Typ eine Klasse oder ein Delegat ist; das heißt, kein Werttyp oder Interface. |
| [get_IsEnum](./get_isenum/)() const | Ruft einen Wert ab, der angibt, ob der aktuelle Typ eine Aufzählung darstellt. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Ruft einen Wert ab, der angibt, ob der aktuelle Typ eine generische Typdefinition darstellt, aus der andere generische Typen erstellt werden können. |
| [get_IsInterface](./get_isinterface/)() const | Ruft einen Wert ab, der angibt, ob der Typ ein Interface ist; das heißt, keine Klasse oder ein Werttyp. |
| [get_IsSealed](./get_issealed/)() const | Ruft einen Wert ab, der angibt, ob der Typ als versiegelt deklariert ist. |
| [get_IsValueType](./get_isvaluetype/)() const | Ruft einen Wert ab, der angibt, ob der Typ ein Werttyp ist. |
| [get_IsVisible](./get_isvisible/)() const | Ruft einen Wert ab, der angibt, ob auf den Typ von Code außerhalb der Assembly zugegriffen werden kann. |
| [get_Name](./get_name/)() const | Gibt den Namen des vom aktuellen Objekt dargestellten Typs zurück. |
| [get_Namespace](./get_namespace/)() const | Ruft den Namespace des Typs ab. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Sucht nach einem öffentlichen Instanzkonstruktor, dessen Parameter mit den Typen im angegebenen Array übereinstimmen. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | Sucht nach den für den aktuellen Typ definierten Konstruktoren unter Verwendung der angegebenen BindingFlags. |
| [GetConstructors](./getconstructors/)() const | Gibt alle für den aktuellen Typ definierten öffentlichen Konstruktoren zurück. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Sucht nach dem benutzerdefinierten Attribut, das den angegebenen Typ hat und auf den vom aktuellen Objekt dargestellten Typ angewendet wird. |
| [GetCustomAttributes](./getcustomattributes/)() const | Gibt ein Array zurück, das Objekte enthält, die alle auf den Typ angewendeten benutzerdefinierten Attribute darstellen. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Gibt ein Array zurück, das Objekte enthält, die spezifische auf den Typ angewendete Attribute darstellen. |
| [GetElementType](./getelementtype/)() const | NICHT IMPLEMENTIERT. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Sucht nach dem angegebenen Feld unter Verwendung der angegebenen Bindungsbeschränkungen. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Sucht nach den für den aktuellen Typ definierten Feldern unter Verwendung der angegebenen Bindungsbeschränkungen. |
| [GetGenericArguments](./getgenericarguments/)() const | Ruft ein Array der generischen Typargumente für diesen Typ ab. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode zurück, der mit dieser Instanz verknüpft ist. |
| [GetInterfaces](./getinterfaces/)() const | Ruft alle von dem aktuellen Typ implementierten oder geerbten Interfaces ab. |
| [GetMember](./getmember/)(const String\&) const | Ermittelt die Liste der Mitglieder mit dem angegebenen Namen. |
| [GetMethod](./getmethod/)(const String\&) const | Ruft die Methode mit dem angegebenen Namen ab. |
| [GetProperties](./getproperties/)() const | Gibt alle öffentlichen Eigenschaften des aktuellen Typs zurück. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Durchsucht die Eigenschaften des aktuellen Typs unter Verwendung der angegebenen Bindungsbeschränkungen. |
| [GetTemplParamType](./gettemplparamtype/)() const | Ermittelt den Deskriptor des Template-Parametertyps. |
| [Hash](./hash/)() const | Gibt einen Hash-Wert zurück, der dem vom aktuellen Objekt dargestellten Typ zugeordnet ist. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Bestimmt, ob eine Instanz eines angegebenen Typs einer Variablen des aktuellen Typs zugewiesen werden kann. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | NICHT IMPLEMENTIERT. Gibt an, ob ein oder mehrere Attribute des angegebenen Typs oder seiner abgeleiteten Typen auf dieses Mitglied angewendet werden. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Bestimmt, ob das angegebene Objekt eine Instanz des aktuellen Typs ist. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Typ eine Unterklasse der angegebenen Klasse ist. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Bestimmt, ob das aktuelle und das angegebene [TypeInfo](./)-Objekt nicht gleich sind. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Bestimmt, ob das aktuelle [TypeInfo](./)-Objekt kein Null-Objekt ist, d. h. es einen Typ darstellt. |
| [operator==](./operator==/)(const TypeInfo\&) const | Bestimmt, ob das aktuelle und das angegebene [TypeInfo](./)-Objekt gleich sind. |
| [operator==](./operator==/)(std::nullptr_t) const | Bestimmt, ob das aktuelle [TypeInfo](./)-Objekt ein Null-Objekt ist, d. h. keinen Typ darstellt. |
| [reset](./reset/)() | Setzt [TypeInfo](./) auf null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Setzt einen Wert, der angibt, ob der Typ ein Werttyp ist. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Setzt den Deskriptor des Basistyps. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Setzt den Deskriptor des Template-Parametertyps. |
| static [StringHash](./stringhash/)(const char_t *) | Berechnet den Hash für die angegebene Zeichenkette. |
| [ToString](./tostring/)() const | Gibt eine Zeichenkette zurück, die den Namen des vom aktuellen Objekt dargestellten Typs enthält. |
| static [Type](./type/)() | Gibt ein [TypeInfo](./)-Objekt zurück, das die Klasse [TypeInfo](./) repräsentiert. |
| [TypeInfo](./typeinfo/)() | Standardkonstruktor (kein Typ ist gesetzt). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Null-Objekt-Konstruktor (kein Typ ist gesetzt). |
| [TypeInfo](./typeinfo/)(const char_t *) | Konstruktor. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Konstruktor. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [EmptyType](./emptytype/) | Konstante, die eine leere Liste von [TypeInfo](./) darstellt. |
| static [EmptyTypes](./emptytypes/) | Konstante, die eine leere Liste von [TypeInfo](./) darstellt. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Funktionszeiger zum Erzeugen des Typs. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
