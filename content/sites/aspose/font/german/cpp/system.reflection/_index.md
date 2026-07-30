---
title: "System::Reflection‑Namensraum"
linktitle: "System::Reflection"
second_title: "Aspose.Font für C++"
description: "Wie man den System::Reflection‑Namensraum in C++ verwendet."
type: docs
weight: 5300
url: /de/cpp/system.reflection/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) Klasse, die eine Assembly beschreibt. Die Unterstützung ist begrenzt, da die Regeln zwischen C# und C++ stark unterschiedlich sind. Objekte dieser Klasse dürfen ausschließlich über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben. |
| [AssemblyName](./assemblyname/) | Definiert den Namen einer Assembly. Objekte dieser Klasse dürfen ausschließlich über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton zum Registrieren eines Typs in der ausführenden Assembly. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Basistyp für Singletons zum Registrieren eines Typs in der ausführenden Assembly. |
| [ConstructorInfo](./constructorinfo/) | Stellt Zugriff auf Konstruktormetadaten bereit. |
| [FieldInfo](./fieldinfo/) | Ermittelt die Attribute eines Feldes und stellt Zugriff auf Feldmetadaten bereit. |
| [MemberInfo](./memberinfo/) | Stellt Reflexionsinformationen zu Mitgliedern bereit. Objekte dieser Klasse dürfen ausschließlich über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben. |
| [MethodBase](./methodbase/) | Grundlegende Informationen zu einer Methode. Objekte dieser Klasse dürfen ausschließlich über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben. |
| [MethodInfo](./methodinfo/) | Stellt Informationen zu einer Klassenmethode dar. |
| [PropertyInfo](./propertyinfo/) | Stellt Eigenschaftsinformationen dar. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [BindingFlags](./bindingflags/) | Definiert Mitglieder- und Typensuchmodi sowie Bindungen. |
| [FieldAttributes](./fieldattributes/) | Reflektierte Feldattribute. |
| [MemberTypes](./membertypes/) | Markiert jeden Mitgliedstyp. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) wird von der Methode Module.GetTypes ausgelöst, wenn eine der Klassen in einem Modul nicht geladen werden kann. Wickeln Sie die [ReflectionTypeLoadException](./reflectiontypeloadexception/)-Klasseninstanzen niemals in einen [System::SmartPtr](../system/smartptr/) ein. |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) wird von Methoden ausgelöst, die über Reflexion aufgerufen werden. Wickeln Sie die [TargetInvocationException](./targetinvocationexception/)-Klasseninstanzen niemals in einen [System::SmartPtr](../system/smartptr/) ein. |
