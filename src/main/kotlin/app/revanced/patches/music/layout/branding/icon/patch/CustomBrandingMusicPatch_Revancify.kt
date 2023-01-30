package app.revanced.patches.music.layout.branding.icon.patch

import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.*
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.shared.annotation.YouTubeMusicCompatibility
import app.revanced.shared.util.resources.IconHelper

@Patch(false)
@Name("custom-branding-music-revancify")
@Description("Changes the YouTube Music launcher icon to your choice (Revancify).")
@YouTubeMusicCompatibility
@Version("0.0.1")
class CustomBrandingMusicPatch_Revancify : ResourcePatch {
    override fun execute(context: ResourceContext): PatchResult {

        IconHelper.customIconMusic(context, "revancify")

        return PatchResultSuccess()
    }

}
