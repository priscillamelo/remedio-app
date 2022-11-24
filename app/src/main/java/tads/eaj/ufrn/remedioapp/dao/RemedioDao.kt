package tads.eaj.ufrn.remedioapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import tads.eaj.ufrn.remedioapp.model.Remedio


@Dao
interface RemedioDao {
    @Query("SELECT * FROM remedio")
    fun listAll(): Flow<List<Remedio>>

    @Query("SELECT * FROM remedio WHERE id=:id")
    fun findById(id: Long): Remedio?

    @Delete
    fun delete(remedio: Remedio)

    @Update
    fun update(remedio: Remedio)

    @Insert
    fun create(remedio: Remedio)
}