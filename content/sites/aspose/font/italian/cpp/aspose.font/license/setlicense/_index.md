---
title: "Aspose::Font::License::SetLicense metodo"
linktitle: "SetLicense"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::License::SetLicense metodo. Concede la licenza al componente in C++."
type: docs
weight: 400
url: /it/cpp/aspose.font/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licenzia il componente.

```cpp
void Aspose::Font::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | Uno stream che contiene la licenza. |
## Osservazioni



Utilizza questo metodo per caricare una licenza da uno stream.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## License::SetLicense(System::String) method


Licenzia il componente.

```cpp
void Aspose::Font::License::SetLicense(System::String licenseName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| licenseName | System::String | Può essere un nome file completo o breve<ms> o il nome di una risorsa incorporata</ms>. Usa una stringa vuota per passare alla modalità di valutazione. |
## Osservazioni


Cerca di trovare la licenza nei seguenti percorsi:

1. Percorso esplicito.

<ms>

2. La cartella che contiene l'assembly del componente **Aspose**.

3. La cartella che contiene l'assembly chiamante del client.

4. La cartella che contiene l'assembly di ingresso (avvio).

5. Una risorsa incorporata nell'assembly chiamante del client.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Percorso esplicito.

2. Una risorsa incorporata nell'assembly chiamante del client.

</ms>

<java>

2. La cartella che contiene il file JAR del componente **Aspose**.

3. La cartella che contiene il file JAR chiamante del client.

</java>

## Vedi anche

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
