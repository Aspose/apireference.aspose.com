---
title: "Aspose::Page::License::SetLicense methode"
linktitle: "SetLicense"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::License::SetLicense methode. Licentieert de component in C++."
type: docs
weight: 400
url: /nl/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licentieert de component.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | Een stream die de licentie bevat. |
## Opmerkingen



Gebruik deze methode om een licentie te laden vanuit een stream.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Licentieert de component.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Opmerkingen


Probeert de licentie te vinden op de volgende locaties:

1. Expliciet pad.

<ms>

2. De map van de componentassembly.

3. De map van de aanroepende assembly van de client.

4. De map van de entry-assembly.

5. Een ingebedde resource in de aanroepende assembly van de client.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Expliciet pad.

2. Een ingebedde resource in de aanroepende assembly van de client.

</ms>

<java>

2. De map van het component-jar-bestand.

</java>
## Zie ook

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
