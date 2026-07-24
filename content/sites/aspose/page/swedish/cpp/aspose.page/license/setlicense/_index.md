---
title: "Aspose::Page::License::SetLicense‑metod"
linktitle: "SetLicense"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::License::SetLicense‑metod. Licensierar komponenten i C++."
type: docs
weight: 400
url: /sv/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licensierar komponenten.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | System::SharedPtr\<System::IO::Stream\> | En ström som innehåller licensen. |
## Anmärkningar



Använd den här metoden för att läsa in en licens från en ström.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Licensierar komponenten.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Anmärkningar


Försöker hitta licensen på följande platser:

1. Explicit sökväg.

<ms>

2. Mappen för komponentens assembly.

3. Mappen för klientens anropande assembly.

4. Mappen för startassemblyn.

5. En inbäddad resurs i klientens anropande assembly.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Explicit sökväg.

2. En inbäddad resurs i klientens anropande assembly.

</ms>

<java>

2. Mappen för komponentens jar‑fil.

</java>
## Se även

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
