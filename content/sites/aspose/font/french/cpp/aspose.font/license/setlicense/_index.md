---
title: "Méthode Aspose::Font::License::SetLicense"
linktitle: "SetLicense"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::License::SetLicense. Licence le composant en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.font/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licence le composant.

```cpp
void Aspose::Font::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | System::SharedPtr\<System::IO::Stream\> | Un flux contenant la licence. |
## Remarques



Utilisez cette méthode pour charger une licence à partir d'un flux.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## License::SetLicense(System::String) method


Licence le composant.

```cpp
void Aspose::Font::License::SetLicense(System::String licenseName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| licenseName | System::String | Peut être un nom de fichier complet ou court<ms> ou le nom d'une ressource intégrée</ms>. Utilisez une chaîne vide pour passer en mode d'évaluation. |
## Remarques


Essaie de trouver la licence aux emplacements suivants :

1. Chemin explicite.

<ms>

2. Le dossier qui contient l'assembly du composant **Aspose**.

3. Le dossier qui contient l'assembly appelant du client.

4. Le dossier qui contient l'assembly d'entrée (démarrage).

5. Une ressource intégrée dans l'assembly appelant du client.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Chemin explicite.

2. Une ressource intégrée dans l'assembly appelant du client.

</ms>

<java>

2. Le dossier qui contient le fichier JAR du composant **Aspose**.

3. Le dossier qui contient le fichier JAR appelant du client.

</java>

## Voir aussi

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
