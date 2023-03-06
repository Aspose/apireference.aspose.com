---
title: Feature.GetValue
second_title: Aspose.GIS für .NET-API-Referenz
description: Feature methode. Ruft den Wert eines Attributs ab.
type: docs
weight: 30
url: /de/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

Ruft den Wert eines Attributs ab.

```csharp
public T GetValue<T>(string attributeName)
```

| Parameter | Beschreibung |
| --- | --- |
| T | Gewünschter Typ für den Wert. |
| attributeName | Name des Attributs. |

### Rückgabewert

Wert des Attributs.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Attributname ist`null`. |
| ArgumentException | Das Attribut mit diesem Namen ist in dieser Ebene nicht vorhanden. |
| InvalidOperationException | Das Attribut ist nicht gesperrt. |
| InvalidOperationException | Der Wert dieses Attributs ist für diese Funktion nicht festgelegt. |
| InvalidCastException | Der angeforderte Typ wird nicht implementiertIConvertible. |
| InvalidCastException | Wert des Attributs ist`null`, aber der angeforderte Typ ist ein Werttyp. |
| FormatException | Die Konvertierung ist fehlgeschlagen, weil der Wert das falsche Format hat. |
| OverflowException | Konvertierung wegen Überlauf fehlgeschlagen. |

### Bemerkungen

Diese Methode konvertiert den Wert automatisch in den Typ, der im generischen Typparameter angefordert wird.  Wenn der Layer nicht erfordert, dass seine Features Werte für alle Attribute haben, die für den Layer definiert sind, kann diese Methode fehlschlagenInvalidOperationException wenn ein fehlender Wert angefordert wird. Wenn Sie mit solchen Ebenen arbeiten, ziehen Sie die Verwendung von in Betracht[`GetValueOrDefault`](../getvalueordefault/) .

### Siehe auch

* class [Feature](../)
* namensraum [Aspose.Gis](../../feature/)
* Montage [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

Ruft den Wert eines Attributs ab.

```csharp
public object GetValue(string attributeName)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| attributeName | String | Name des Attributs. |

### Rückgabewert

Wert des Attributs.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Attributname ist`null`. |
| ArgumentException | Das Attribut mit diesem Namen ist in dieser Ebene nicht vorhanden. |
| InvalidOperationException | Das Attribut ist nicht gesperrt. |
| InvalidOperationException | Der Wert dieses Attributs ist für diese Funktion nicht festgelegt. |

### Bemerkungen

Wenn der Layer nicht erfordert, dass seine Features Werte für alle Attribute haben, die für den Layer definiert sind, kann diese Methode fehlschlagenInvalidOperationException wenn ein fehlender Wert angefordert wird. Wenn Sie mit solchen Ebenen arbeiten, ziehen Sie die Verwendung von in Betracht[`GetValueOrDefault`](../getvalueordefault/) .

### Siehe auch

* class [Feature](../)
* namensraum [Aspose.Gis](../../feature/)
* Montage [Aspose.GIS](../../../)


