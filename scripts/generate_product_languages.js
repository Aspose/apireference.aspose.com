const path = require('node:path')
const fs = require('node:fs/promises')

// Scans every product's _default/config.toml for its [languages.xx] blocks and writes
// a product -> [language codes] map to data/product_languages.json, so the home page's
// product-card/product-item shortcodes can compute a localized-or-English-fallback href
// at build time instead of hardcoding one English href per product/platform.
//
// Run manually (`node scripts/generate_product_languages.js`) whenever a product's
// language set changes -- not wired into CI, this takes a couple of seconds.

const configsDir = path.join(__dirname, '..', 'config', 'sites', 'aspose')
const outputFile = path.join(__dirname, '..', 'data', 'product_languages.json')

async function main() {
    const products = (await fs.readdir(configsDir, { withFileTypes: true }))
        .filter(e => e.isDirectory())
        .map(e => e.name)
        .sort()

    const result = {}
    for (const product of products) {
        const configPath = path.join(configsDir, product, '_default', 'config.toml')
        let contents
        try {
            contents = await fs.readFile(configPath, 'utf8')
        } catch {
            continue
        }
        const langs = [...contents.matchAll(/^\s*\[languages\.([a-z-]+)\]/gm)]
            .map(m => m[1])
        if (langs.length) {
            result[product] = [...new Set(langs)]
        }
    }

    await fs.mkdir(path.dirname(outputFile), { recursive: true })
    await fs.writeFile(outputFile, JSON.stringify(result, null, 2) + '\n')
    console.info(`Wrote ${Object.keys(result).length} products to ${outputFile}`)
}

main()
