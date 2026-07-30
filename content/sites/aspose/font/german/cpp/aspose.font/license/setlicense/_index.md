---
title: "Aspose::Font::License::SetLicense-Methode"
linktitle: "SetLicense"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::License::SetLicense-Methode. Lizenziert die Komponente in C++."
type: docs
weight: 400
url: /de/cpp/aspose.font/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Lizenziert die Komponente.

```cpp
void Aspose::Font::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | System::SharedPtr\<System::IO::Stream\> | Ein Stream, der die Lizenz enthält. |
## Hinweise



Verwenden Sie diese Methode, um eine Lizenz aus einem Stream zu laden.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## License::SetLicense(System::String) method


Lizenziert die Komponente.

```cpp
void Aspose::Font::License::SetLicense(System::String licenseName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| licenseName | System::String | Kann ein voller oder kurzer Dateiname<ms> oder der Name einer eingebetteten Ressource</ms> sein. Verwenden Sie einen leeren String, um in den Evaluierungsmodus zu wechseln. |
## Hinweise


Versucht, die Lizenz an den folgenden Orten zu finden:

1. Expliziter Pfad.

<ms>

2. Der Ordner, der die **Aspose**-Komponentenassembly enthält.

3. Der Ordner, der die Aufruf-Assembly des Clients enthält.

4. Der Ordner, der die Einstieg-(Start‑)Assembly enthält.

5. Eine eingebettete Ressource in der Aufruf-Assembly des Clients.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Expliziter Pfad.

2. Eine eingebettete Ressource in der Aufruf-Assembly des Clients.

</ms>

<java>

2. Der Ordner, der die **Aspose**-Komponenten‑JAR-Datei enthält.

3. Der Ordner, der die Aufruf‑JAR-Datei des Clients enthält.

</java>

## Siehe auch

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
