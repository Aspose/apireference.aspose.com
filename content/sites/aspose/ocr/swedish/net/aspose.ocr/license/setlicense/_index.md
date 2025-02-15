---
title: License.SetLicense
second_title: Aspose.OCR för .NET API-referens
description: License metod. Licensierar komponenten.
type: docs
weight: 30
url: /sv/net/aspose.ocr/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

Licensierar komponenten.

```csharp
public void SetLicense(string licenseName)
```

### Anmärkningar

Försöker hitta licensen på följande platser:

1. Explicit väg.

2. Mappen som innehåller Aspose-komponentsammansättningen.

3. Mappen som innehåller klientens anropssammansättning.

4. Mappen som innehåller posten (start) assembly.

5. En inbäddad resurs i klientens anropssammansättning.

**Notera:**På .NET Compact Framework försöker du hitta licensen endast på dessa platser:

1. Explicit väg.

2. En inbäddad resurs i klientens anropssammansättning.

### Exempel

I det här exemplet kommer ett försök att göras att hitta en licensfil med namnet MyLicense.lic i mappen som innehåller komponenten, i mappen som innehåller den anropande assembly, i mappen och sedan entry i mappen de inbäddade resurserna för den anropande församlingen. Kan vara ett fullständigt eller kort filnamn eller namn på en inbäddad resurs. Använd en tom sträng för att växla till utvärderingsläge.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Se även

* class [License](../)
* namnutrymme [Aspose.OCR](../../license/)
* hopsättning [Aspose.OCR](../../../)

---

## SetLicense(Stream) {#setlicense}

Licensierar komponenten.

```csharp
public void SetLicense(Stream stream)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | Stream | En stream som innehåller licensen. |

### Anmärkningar

Använd den här metoden för att ladda en licens från en stream.

### Exempel

```csharp
[C#]

License license = new License();
license.SetLicense(myStream);
```

### Se även

* class [License](../)
* namnutrymme [Aspose.OCR](../../license/)
* hopsättning [Aspose.OCR](../../../)


