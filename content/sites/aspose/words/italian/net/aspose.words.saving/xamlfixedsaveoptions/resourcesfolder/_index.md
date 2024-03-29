---
title: XamlFixedSaveOptions.ResourcesFolder
linktitle: ResourcesFolder
articleTitle: ResourcesFolder
second_title: Aspose.Words per .NET
description: XamlFixedSaveOptions ResourcesFolder proprietà. Specifica la cartella fisica in cui vengono salvate le risorse immagini e caratteri durante lesportazione di un documento in formato Xaml a pagina fissa. Limpostazione predefinita ènullo  in C#.
type: docs
weight: 30
url: /it/net/aspose.words.saving/xamlfixedsaveoptions/resourcesfolder/
---
## XamlFixedSaveOptions.ResourcesFolder property

Specifica la cartella fisica in cui vengono salvate le risorse (immagini e caratteri) durante l'esportazione di un documento in formato Xaml a pagina fissa. L'impostazione predefinita è`nullo` .

```csharp
public string ResourcesFolder { get; set; }
```

## Osservazioni

Quando salvi un file[`Document`](../../../aspose.words/document/) nel formato Xaml a pagina fissa, Aspose.Words deve salvare tutte le immagini incorporate nel documento come file autonomi.`ResourcesFolder` ti consente di specificare dove verranno salvate le immagini e[`ResourcesFolderAlias`](../resourcesfolderalias/) consente di specificare come verranno costruiti gli URI dell'immagine.

Se salvi un documento in un file e fornisci un nome file, Aspose.Words, per impostazione predefinita, salva le immagini nella stessa cartella in cui è salvato il file del documento. Utilizzo`ResourcesFolder` per sovrascrivere questo comportamento.

Se salvi un documento in uno stream, Aspose.Words non ha una cartella in cui salvare le immagini, ma deve comunque salvare le immagini da qualche parte. In questo caso, è necessario specificare una cartella accessibile utilizzando il file`ResourcesFolder` proprietà

## Esempi

Mostra come stampare gli URI delle risorse collegate create durante la conversione di un documento in formato .xaml.

```csharp
public void ResourceFolder()
{
    Document doc = new Document(MyDir + "Rendering.docx");
    ResourceUriPrinter callback = new ResourceUriPrinter();

    // Crea un oggetto "XamlFixedSaveOptions", che possiamo passare al metodo "Save" del documento
    // per modificare il modo in cui salviamo il documento nel formato di salvataggio XAML.
    XamlFixedSaveOptions options = new XamlFixedSaveOptions();

    Assert.AreEqual(SaveFormat.XamlFixed, options.SaveFormat);

    // Utilizzare la proprietà "ResourcesFolder" per assegnare una cartella nel file system locale in cui
    // Aspose.Words salverà tutte le risorse collegate del documento, come immagini e caratteri.
    options.ResourcesFolder = ArtifactsDir + "XamlFixedResourceFolder";

    // Utilizzare la proprietà "ResourcesFolderAlias" per utilizzare questa cartella
    // quando si costruiscono URI di immagine invece del nome della cartella delle risorse.
    options.ResourcesFolderAlias = ArtifactsDir + "XamlFixedFolderAlias";

    options.ResourceSavingCallback = callback;

    // Una cartella specificata da "ResourcesFolderAlias" dovrà contenere le risorse invece di "ResourcesFolder".
    // Dobbiamo garantire che la cartella esista prima che i flussi di callback possano inserirvi le proprie risorse.
    Directory.CreateDirectory(options.ResourcesFolderAlias);

    doc.Save(ArtifactsDir + "XamlFixedSaveOptions.ResourceFolder.xaml", options);

    foreach (string resource in callback.Resources)
        Console.WriteLine(resource);
}

/// <summary>
/// Conta e stampa gli URI delle risorse create durante la conversione in .xaml fisso.
/// </summary>
private class ResourceUriPrinter : IResourceSavingCallback
{
    public ResourceUriPrinter()
    {
        Resources = new List<string>();
    }

    void IResourceSavingCallback.ResourceSaving(ResourceSavingArgs args)
    {
        Resources.Add($"Resource \"{args.ResourceFileName}\"\n\t{args.ResourceFileUri}");

        // Se specificassimo un alias della cartella delle risorse, avremmo anche bisogno
        // per reindirizzare ciascun flusso per inserire la relativa risorsa nella cartella alias.
        args.ResourceStream = new FileStream(args.ResourceFileUri, FileMode.Create);
        args.KeepResourceStreamOpen = false;
    }

    public List<string> Resources { get; }
}
```

### Guarda anche

* class [XamlFixedSaveOptions](../)
* spazio dei nomi [Aspose.Words.Saving](../../../aspose.words.saving/)
* assemblea [Aspose.Words](../../../)
