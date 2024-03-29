---
title: HtmlFixedSaveOptions.ResourcesFolderAlias
linktitle: ResourcesFolderAlias
articleTitle: ResourcesFolderAlias
second_title: Aspose.Words für .NET
description: HtmlFixedSaveOptions ResourcesFolderAlias eigendom. Gibt den Namen des Ordners an der zum Erstellen von BildURIs verwendet wird die in ein HTMLDokument geschrieben werden. Der Standardwert istNull  in C#.
type: docs
weight: 150
url: /de/net/aspose.words.saving/htmlfixedsaveoptions/resourcesfolderalias/
---
## HtmlFixedSaveOptions.ResourcesFolderAlias property

Gibt den Namen des Ordners an, der zum Erstellen von Bild-URIs verwendet wird, die in ein HTML-Dokument geschrieben werden. Der Standardwert ist`Null` .

```csharp
public string ResourcesFolderAlias { get; set; }
```

## Bemerkungen

Wenn Sie a speichern[`Document`](../../../aspose.words/document/) Im HTML-Format muss Aspose.Words alle im Dokument eingebetteten -Bilder als eigenständige Dateien speichern.[`ResourcesFolder`](../resourcesfolder/) Mit können Sie angeben, wo die Bilder gespeichert werden`ResourcesFolderAlias` ermöglicht die Angabe, wie die Bild-URIs erstellt werden.

## Beispiele

Zeigt, wie Sie einen Rückruf verwenden, um die URIs externer Ressourcen zu drucken, die beim Konvertieren eines Dokuments in HTML erstellt wurden.

```csharp
public void HtmlFixedResourceFolder()
{
    Document doc = new Document(MyDir + "Rendering.docx");

    ResourceUriPrinter callback = new ResourceUriPrinter();

    HtmlFixedSaveOptions options = new HtmlFixedSaveOptions
    {
        SaveFormat = SaveFormat.HtmlFixed,
        ExportEmbeddedImages = false,
        ResourcesFolder = ArtifactsDir + "HtmlFixedResourceFolder",
        ResourcesFolderAlias = ArtifactsDir + "HtmlFixedResourceFolderAlias",
        ShowPageBorder = false,
        ResourceSavingCallback = callback
    };

    // Ein durch ResourcesFolderAlias angegebener Ordner enthält die Ressourcen anstelle von ResourcesFolder.
    // Wir müssen sicherstellen, dass der Ordner existiert, bevor die Streams ihre Ressourcen darin ablegen können.
    Directory.CreateDirectory(options.ResourcesFolderAlias);

    doc.Save(ArtifactsDir + "HtmlFixedSaveOptions.HtmlFixedResourceFolder.html", options);

    Console.WriteLine(callback.GetText());

    string[] resourceFiles = Directory.GetFiles(ArtifactsDir + "HtmlFixedResourceFolderAlias");

    Assert.False(Directory.Exists(ArtifactsDir + "HtmlFixedResourceFolder"));
    Assert.AreEqual(6, resourceFiles.Count(f => f.EndsWith(".jpeg") || f.EndsWith(".png") || f.EndsWith(".css")));
}

/// <summary>
/// Zählt und druckt URIs von Ressourcen, die in enthalten sind, während sie in festes HTML konvertiert werden.
/// </summary>
private class ResourceUriPrinter : IResourceSavingCallback
{
    void IResourceSavingCallback.ResourceSaving(ResourceSavingArgs args)
    {
        // Wenn wir im SaveOptions-Objekt einen Ordneralias festlegen, können wir ihn von hier aus drucken.
        mText.AppendLine($"Resource #{++mSavedResourceCount} \"{args.ResourceFileName}\"");

        string extension = Path.GetExtension(args.ResourceFileName);
        switch (extension)
        {
            case ".ttf":
            case ".woff":
            {
                // Standardmäßig verwendet „ResourceFileUri“ den Systemordner für Schriftarten.
                // Um Probleme auf anderen Plattformen zu vermeiden, müssen Sie den Pfad für die Schriftarten explizit angeben.
                args.ResourceFileUri = ArtifactsDir + Path.DirectorySeparatorChar + args.ResourceFileName;
                break;
            }
        }

        mText.AppendLine("\t" + args.ResourceFileUri);

        // Wenn wir in der Eigenschaft „ResourcesFolderAlias“ einen Ordner angegeben haben,
        // Wir müssen auch jeden Stream umleiten, um seine Ressource in diesem Ordner abzulegen.
        args.ResourceStream = new FileStream(args.ResourceFileUri, FileMode.Create);
        args.KeepResourceStreamOpen = false;
    }

    public string GetText()
    {
        return mText.ToString();
    }

    private int mSavedResourceCount;
    private readonly StringBuilder mText = new StringBuilder();
}
```

### Siehe auch

* class [HtmlFixedSaveOptions](../)
* namensraum [Aspose.Words.Saving](../../../aspose.words.saving/)
* Montage [Aspose.Words](../../../)
