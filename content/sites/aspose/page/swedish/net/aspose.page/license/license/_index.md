---
title: License.License
second_title: Aspose.Page för .NET API-referens
description: License byggare. Initierar en ny instans av den här klassen.
type: docs
weight: 10
url: /sv/net/aspose.page/license/license/
---
## License constructor

Initierar en ny instans av den här klassen.

```csharp
public License()
```

### Exempel

I det här exemplet kommer ett försök att göras att hitta en licensfil med namnet MyLicense.lic i mappen som innehåller  komponenten, i mappen som innehåller den anropande sammansättningen, i mappen för postsammansättningen och sedan i de inbäddade resurserna för den anropande sammansättningen.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

komponentjarfilen:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### Se även

* class [License](../)
* namnutrymme [Aspose.Page](../../license/)
* hopsättning [Aspose.Page](../../../)


