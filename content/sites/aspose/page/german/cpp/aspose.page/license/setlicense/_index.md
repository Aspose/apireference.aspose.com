---
title: "Aspose::Page::License::SetLicense-Methode"
linktitle: "SetLicense"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::License::SetLicense-Methode. Lizenziert die Komponente in C++."
type: docs
weight: 400
url: /de/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Lizenziert die Komponente.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
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
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Lizenziert die Komponente.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Hinweise


Versucht, die Lizenz an den folgenden Orten zu finden:

1. Expliziter Pfad.

<ms>

2. Der Ordner der Komponenten‑Assembly.

3. Der Ordner der aufrufenden Assembly des Clients.

4. Der Ordner der Entry‑Assembly.

5. Eine eingebettete Ressource in der aufrufenden Assembly des Clients.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Expliziter Pfad.

2. Eine eingebettete Ressource in der aufrufenden Assembly des Clients.

</ms>

<java>

2. Der Ordner der Komponenten‑JAR-Datei.

</java>
## Siehe auch

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
