---
title: "Aspose::Page::License::SetLicense metodo"
linktitle: "SetLicense"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::License::SetLicense metodo. Attiva la licenza del componente in C++."
type: docs
weight: 400
url: /it/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licenzia il componente.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
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
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Licenzia il componente.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Osservazioni


Cerca di trovare la licenza nelle seguenti posizioni:

1. Percorso esplicito.

<ms>

2. La cartella dell'assembly del componente.

3. La cartella dell'assembly chiamante del client.

4. La cartella dell'assembly di ingresso.

5. Una risorsa incorporata nell'assembly chiamante del client.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Percorso esplicito.

2. Una risorsa incorporata nell'assembly chiamante del client.

</ms>

<java>

2. La cartella del file jar del componente.

</java>
## Vedi anche

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
