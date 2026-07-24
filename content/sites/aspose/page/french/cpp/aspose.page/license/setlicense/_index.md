---
title: "Aspose::Page::License::SetLicense méthode"
linktitle: "SetLicense"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::License::SetLicense méthode. Licence le composant en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licence le composant.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | System::SharedPtr\<System::IO::Stream\> | Un flux qui contient la licence. |
## Remarques



Utilisez cette méthode pour charger une licence à partir d'un flux.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Licence le composant.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Remarques


Essaie de trouver la licence aux emplacements suivants :

1. Chemin explicite.

<ms>

2. Le dossier de l'assembly du composant.

3. Le dossier de l'assembly appelant du client.

4. Le dossier de l'assembly d'entrée.

5. Une ressource intégrée dans l'assembly appelant du client.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Chemin explicite.

2. Une ressource intégrée dans l'assembly appelant du client.

</ms>

<java>

2. Le dossier du fichier jar du composant.

</java>
## Voir aussi

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
