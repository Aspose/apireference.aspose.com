---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs-Methode"
linktitle: "ValueAs"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs-Methode. Gibt den validierten Wert des XML-Elements oder Attributs als den mit dem IXmlNamespaceResolver-Objekt angegebenen Typ zurück, das zum Auflösen von Namensraumpräfixen in C++ verwendet wird."
type: docs
weight: 1300
url: /de/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Gibt den validierten Wert des XML-Elements oder Attributs als den mit dem [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) angegebenen Typ zurück, das zum Auflösen von Namensraumpräfixen verwendet wird.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Typ | const TypeInfo\& | Der Typ, in den der validierte Wert des XML-Elements oder Attributs zurückgegeben werden soll. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Das [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt, das zum Auflösen von Namensraumpräfixen verwendet wird. |

### ReturnValue

Der Wert des validierten XML-Elements oder Attributs im angeforderten Typ.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
