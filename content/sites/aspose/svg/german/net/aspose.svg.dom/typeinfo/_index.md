---
title: Class TypeInfo
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.Dom.TypeInfo klas. Die TypeInfo stellt einen Typ dar auf den von Element oder AttrKnoten verwiesen wird die in den mit dem Dokument verknüpften Schemas angegeben sind.
type: docs
weight: 1280
url: /de/net/aspose.svg.dom/typeinfo/
---
## TypeInfo class

Die TypeInfo stellt einen Typ dar, auf den von Element- oder Attr-Knoten verwiesen wird, die in den mit dem Dokument verknüpften Schemas angegeben sind.

```csharp
public class TypeInfo : DOMObject
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [TypeName](../../aspose.svg.dom/typeinfo/typename/) { get; } | Der Name eines für das zugeordnete Element oder Attribut deklarierten Typs oder null, falls unbekannt. |
| [TypeNamespace](../../aspose.svg.dom/typeinfo/typenamespace/) { get; } | Ruft den Typnamensraum ab. Der Namensraum des für das zugeordnete Element oder Attribut deklarierten Typs oder null, wenn das Element keine Deklaration hat oder wenn keine Namensrauminformationen verfügbar sind. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| [IsDerivedFrom](../../aspose.svg.dom/typeinfo/isderivedfrom/)(string, string, ulong) | Diese Methode gibt zurück, wenn es eine Ableitung zwischen der Referenztypdefinition, dh der TypeInfo, auf der die Methode aufgerufen wird, und der anderen Typdefinition, dh derjenigen, die als Parameter übergeben wird, gibt. |

## Felder

| Name | Beschreibung |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.svg.dom/typeinfo/derivation_extension/) | Wenn das Schema des Dokuments ein XML-Schema [XML-Schema Teil 1] ist, repräsentiert diese Konstante die Ableitung durch Erweiterung. |
| const [DERIVATION_LIST](../../aspose.svg.dom/typeinfo/derivation_list/) | Wenn das Schema des Dokuments ein XML-Schema [XML-Schema Teil 1] ist, repräsentiert diese Konstante die Liste. |
| const [DERIVATION_RESTRICTION](../../aspose.svg.dom/typeinfo/derivation_restriction/) | Wenn das Schema des Dokuments ein XML-Schema [XML-Schema Teil 1] ist, stellt diese Konstante die Ableitung durch Einschränkung dar, wenn es sich um komplexe Typen handelt, oder um eine Einschränkung, wenn es sich um einfache Typen handelt. |
| const [DERIVATION_UNION](../../aspose.svg.dom/typeinfo/derivation_union/) | Wenn das Schema des Dokuments ein XML-Schema [XML-Schema Teil 1] ist, stellt diese Konstante die Vereinigung dar, wenn es sich um einfache Typen handelt. |

### Siehe auch

* class [DOMObject](../domobject/)
* namensraum [Aspose.Svg.Dom](../../aspose.svg.dom/)
* Montage [Aspose.SVG](../../)


