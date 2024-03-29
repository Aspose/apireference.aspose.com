---
title: Class MspDbSettings
second_title: Référence de l'API Aspose.Tasks pour .NET
description: Aspose.Tasks.Connectivity.MspDbSettings classe. Permet de définir les options nécessaires pour lire les données du projet à partir de la base de données MS Project Server.
type: docs
weight: 310
url: /fr/net/aspose.tasks.connectivity/mspdbsettings/
---
## MspDbSettings class

Permet de définir les options nécessaires pour lire les données du projet à partir de la base de données MS Project Server.

```csharp
public class MspDbSettings : DbSettings
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [MspDbSettings](mspdbsettings/)(string, Guid) | Initialise une nouvelle instance du`MspDbSettings` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [ConnectionString](../../aspose.tasks.connectivity/dbsettings/connectionstring/) { get; set; } | Obtient ou définit la chaîne de connexion. |
| [ProjectGuid](../../aspose.tasks.connectivity/mspdbsettings/projectguid/) { get; } | Obtient le GUID du projet à lire. |
| [ProviderInvariantName](../../aspose.tasks.connectivity/dbsettings/providerinvariantname/) { get; set; } | Obtient ou définit le nom invariant du fournisseur qui est utilisé pour obtenir une instance duDbProviderFactory classe.  La valeur par défaut estSqlClient. |
| [Schema](../../aspose.tasks.connectivity/mspdbsettings/schema/) { get; set; } | Obtient ou définit le schéma de MS Project Server. La valeur par défaut est "pub". |

### Voir également

* class [DbSettings](../dbsettings/)
* espace de noms [Aspose.Tasks.Connectivity](../../aspose.tasks.connectivity/)
* Assemblée [Aspose.Tasks](../../)


