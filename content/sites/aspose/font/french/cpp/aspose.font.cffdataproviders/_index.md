---
title: "espace de noms Aspose::Font::CffDataProviders"
linktitle: "Aspose::Font::CffDataProviders"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser l'espace de noms Aspose::Font::CffDataProviders en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.cffdataproviders/
---



## Classes

| Classe | Description |
| --- | --- |
| [CffPrivateDictDataProvider](./cffprivatedictdataprovider/) |  |
| [CffTopDictDataProvider](./cfftopdictdataprovider/) |  |
| [ICffIndexDataProvider](./icffindexdataprovider/) | Interface de base pour accéder aux structures INDEX des polices CFF. |
| [IStringIndexAdapter](./istringindexadapter/) |  |
| [NameIndexDataProvider](./nameindexdataprovider/) | Déclare la fonctionnalité d'accès à la structure INDEX Name de CFF. |
| [PrivateDictDataProvider](./privatedictdataprovider/) | Déclare la fonctionnalité de lecture/mise à jour de la structure DICT Private de CFF. |
| [StringIndexDataProvider](./stringindexdataprovider/) | Déclare la fonctionnalité d'accès à la structure CFF String INDEX. |
| [TopDictDataProvider](./topdictdataprovider/) | Déclare la fonctionnalité de lecture/mise à jour de la structure CFF Top DICT. |
## Enums

| Énumération | Description |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | Spécifie les structures INDEX prises en charge par la famille d'interfaces du fournisseur d'index. |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | Spécifie comment ajouter des chaînes au stockage CFF String INDEX. Lorsque nous essayons d'ajouter une chaîne dans CFF String INDEX, il peut arriver que cette chaîne soit déjà présente dans le String INDEX. En utilisant l'option [SearchForDuplicates](./cffupdatestringindexstrategy/), nous pouvons forcer la recherche dans le String INDEX pour détecter si cette chaîne est déjà présente ou non. Cette approche économise de l'espace dans la structure String INDEX, mais nécessite plus de temps pour ajouter la chaîne. |
